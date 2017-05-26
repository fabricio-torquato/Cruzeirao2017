package sistema.dao;

import sistema.entidade.Categoria;


public class CategoryDAO extends GenericDAO<Categoria, Integer>{
	@Override
	protected Class<Categoria> getClasseEntidade() {
		return Categoria.class;
	}	

}
