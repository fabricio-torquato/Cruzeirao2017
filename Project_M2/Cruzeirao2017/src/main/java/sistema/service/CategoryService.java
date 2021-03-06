package sistema.service;

import java.io.Serializable;
import java.util.List;

import sistema.dao.CategoryDAO;
import sistema.entidade.Categoria;

public class CategoryService implements Serializable{

	private static final long serialVersionUID = 1L;
	CategoryDAO categoryDAO = new CategoryDAO();

	public Categoria save(Categoria categoria){
		
		categoria = categoryDAO.salvar(categoria);
		categoryDAO.closeEntityManager();
		return categoria;
	}

	public List <Categoria> getCategorys()
	{
		List <Categoria> list =  categoryDAO.getAll(Categoria.class);
		categoryDAO.closeEntityManager();
		return list;
	}
	public void update(Categoria category)
	{
		categoryDAO.salvar(category);
		categoryDAO.closeEntityManager();
	}
	public void remove(Categoria category)
	{
		category = categoryDAO.getById(Categoria.class, category.getId());
		categoryDAO.remover(category);
		categoryDAO.closeEntityManager();
	}
	public List <Categoria> getCategoryNoChamp()
	{
		// TODO IMPLEMENTAR Trazer Categoria sem Campeonato relacionado
		List <Categoria> list =  categoryDAO.getAll(Categoria.class);
		categoryDAO.closeEntityManager();
		return list;
	}
}
