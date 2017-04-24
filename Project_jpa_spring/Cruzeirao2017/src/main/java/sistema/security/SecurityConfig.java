package sistema.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	private static UserDetailsService usuarioService = new UsuarioSistemaService();

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(usuarioService);

	}

	// @Override
	protected void configure(HttpSecurity http) throws Exception {

		// Controle feito pelo JSF
		http.csrf().disable();

		// Página de acesso negado
		http.exceptionHandling().accessDeniedPage("/pages/adm/manager/coach/user/noUser/acessonegado.xhtml");

		// Libera todos os recursos do JSF
		http.authorizeRequests().antMatchers("/pages/adm/manager/coach/user/noUser/**", "/resources/**",
				"/javax.faces.resource/**", "/webapp/resources/**").permitAll();

		// Controla o acesso a página protegida do user
		http.authorizeRequests().antMatchers("/pages/adm/manager/coach/user/**").hasAnyRole("USER", "COACH", "MANAGER",
				"ADMIN");

		// Controla o acesso a página protegida do coach
		http.authorizeRequests().antMatchers("/pages/adm/manager/coach/**").hasAnyRole("COACH", "MANAGER", "ADMIN");

		// Controla o acesso a página protegida do manager
		http.authorizeRequests().antMatchers("/pages/adm/manager/**").hasAnyRole("MANAGER", "ADMIN");

		// Controla o acesso a página protegida do adm
		http.authorizeRequests().antMatchers("/pages/adm/**").hasRole("ADMIN");

		// Login
		http.formLogin().loginPage("/pages/adm/manager/coach/user/noUser/login.xhtml").permitAll()
				.defaultSuccessUrl("/pages/adm/manager/coach/user/perfil.xhtml", true)
				.failureUrl("/pages/adm/manager/coach/user/noUser/login.xhtml?error=true").usernameParameter("username")
				.passwordParameter("password");

		// Logout
		http.logout().logoutUrl("/logout").logoutSuccessUrl("/pages/adm/manager/coach/user/noUser/login.xhtml");

		// Todas as requisições para partes internas da aplicação devem ser
		// autenticadas
		http.authorizeRequests().anyRequest().authenticated();

	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/resources/**", "/javax.faces.resource/**", "/webapp/resources/**");
	}
}
