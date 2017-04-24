package sistema.service;

import org.springframework.stereotype.Service;

import sistema.dao.UsuarioDAO;
import sistema.entidade.Usuario;


@Service
public class UsuarioService {

	UsuarioDAO userDAO;
	
	public UsuarioService(){
		userDAO = new UsuarioDAO();
	}
	
	public Usuario salvar(Usuario usuario){
		userDAO.salvar(usuario);
		userDAO.closeEntityManager();
		return usuario;
	}
}
