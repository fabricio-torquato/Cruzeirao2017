package sistema.dao;

import sistema.entidade.Cliente;

public class ClienteDAO extends GenericoDAO<Cliente>{

	@Override
	protected Class<Cliente> getClasseEntidade() {
		return Cliente.class;
	}

}
