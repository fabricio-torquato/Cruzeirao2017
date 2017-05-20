package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.event.RowEditEvent;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import sistema.entidade.Usuario;
import sistema.entidade.enums.Roles;
import sistema.service.UsuarioService;

@ManagedBean
@SessionScoped
public class UsuarioManagedBean extends UploadManagedBean {

	private Usuario usuario = new Usuario();
	private Usuario usuarioLogado = null;
	private UsuarioService userService = new UsuarioService();
	private List<Usuario> usuarios = null;

	public Usuario getUsuario() {
		usuarioLogado = null;
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Usuario getUsuarioLogado() {
		if (usuarioLogado == null)
			logado();
		return usuarioLogado;
	}

	public void setUsuarioLogado(Usuario usuarioLogado) {
		this.usuarioLogado = usuarioLogado;
	}

	public void salvar() {
		usuario.setRole(Roles.USER);
		userService.salvar(usuario);
		usuario = new Usuario();
	}

	public void uploadImage(FileUploadEvent event) {
		usuario.setFoto(handleFileUpload(event));
	}

	private void logado() {
		Object Logado = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username;
		if (Logado instanceof UserDetails) {
			username = ((UserDetails) Logado).getUsername();
			usuarioLogado = userService.logado(username);
		}
	}

	// Retorna a lista de usuarios para a tabela
	public List<Usuario> getUsuarios() {
		if (usuarios == null)
			usuarios = userService.getUsuarios();

		return usuarios;
	}

	// Edição de um aluno na tabela
	public void onRowEdit(RowEditEvent event) {

		Usuario u = (Usuario) event.getObject();
		userService.salvar(u);
	}
	public void atualizar(){
		userService.salvar(usuarioLogado);
	}
	public void remover(Usuario usuario) {
		userService.remover(usuario);
	}
}
