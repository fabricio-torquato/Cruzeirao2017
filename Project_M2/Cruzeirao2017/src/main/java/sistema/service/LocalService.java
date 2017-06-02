package sistema.service;

import java.util.List;

import sistema.dao.LocalDAO;
import sistema.entidade.Local;

public class LocalService {
	
	LocalDAO localDAO = new LocalDAO();

	public Local save(Local local){
		
		local = localDAO.salvar(local);
		localDAO.closeEntityManager();
		return local;
	}

	public List <Local> getLocals()
	{
		List <Local> list =  localDAO.getAll(Local.class);
		localDAO.closeEntityManager();
		return list;
	}
	public void update(Local local)
	{
		localDAO.salvar(local);
		localDAO.closeEntityManager();
	}
	public void remove(Local local)
	{
		local = localDAO.getById(Local.class, local.getId());
		localDAO.remover(local);
		localDAO.closeEntityManager();
	}
}
