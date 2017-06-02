package sistema.service;

import javax.inject.Inject;

import sistema.dao.ClienteDAO;
import sistema.dao.transactional.Transactional;
import sistema.entidade.Cliente;

public class ClienteService {
	
	
	@Inject
	private ClienteDAO clienteDAO;

	
	@Transactional
	public void salvar(Cliente cliente) {
		validarCliente(cliente);
		clienteDAO.salvar(cliente);
		
	}

	private void validarCliente(Cliente cliente) {
		
		if(cliente==null){
			throw new NegocioException("Não foi possível salvar o cliente,"
					+ " por favor entre em contado com o suporte");
		}
		
		if(cliente.getNome().length() <=3)
			throw new NegocioException("Não foi possível salvar o cliente, tamanho nome,"
					+ " por favor entre em contado com o suporte");
		
	}

}
