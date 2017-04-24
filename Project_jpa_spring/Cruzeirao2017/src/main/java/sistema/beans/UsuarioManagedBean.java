package sistema.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.entidade.Roles;
import sistema.entidade.Usuario;
import sistema.service.UsuarioService;

@ManagedBean
@SessionScoped
public class UsuarioManagedBean {
	
	private Usuario usuario = new Usuario();
	private UsuarioService userService = new UsuarioService();
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String salvar()
	{
		usuario.setRole(Roles.USER);
		userService.salvar(usuario);
		usuario = new Usuario();
		return "/pages/adm/manager/coach/user/noUser/login.xhtml?";
	}
}

