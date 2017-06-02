package sistema.primefaces.util;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.entidade.Local;
import sistema.entidade.Usuario;

@ManagedBean
@SessionScoped
public class DialogManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Usuario usuario; 
	private Local local;
	public Local getLocal() {
		return local;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
