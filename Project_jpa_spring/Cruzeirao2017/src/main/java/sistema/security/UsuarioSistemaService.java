package sistema.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import sistema.cdi.util.CDIServiceLocator;
import sistema.dao.UsuarioDAO;
import sistema.entidade.Usuario;

public class UsuarioSistemaService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(final String login) throws UsernameNotFoundException {
		
		
		UsuarioDAO usuarioService = CDIServiceLocator.getBean(UsuarioDAO.class);
		
						
		//Pesquisar o usu�rio no banco
		Usuario usuario = usuarioService.pesquisarPorUserName(login);
		
		
		if (usuario != null) {
			return new UsuarioSistema(usuario, obtemGruposdoUsuario(usuario));
		}

		throw new UsernameNotFoundException("Usu�rio n�o encontrado");
	}

	private Collection<? extends GrantedAuthority> obtemGruposdoUsuario(Usuario usuario) {
		List<GrantedAuthority> papeis = new ArrayList<>();
		
		papeis.add(new SimpleGrantedAuthority("ROLE_" + usuario.getRole()));

		return papeis;
	}
}
