package sistema.dao;

import sistema.entidade.Local;

public class LocalDAO extends GenericDAO<Local, Integer> {

	@Override
	protected Class<Local> getClasseEntidade() {
		return Local.class;
	}

}
