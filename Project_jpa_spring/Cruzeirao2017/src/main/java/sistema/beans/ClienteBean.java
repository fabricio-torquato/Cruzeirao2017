package sistema.beans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


import sistema.cdi.util.CDIServiceLocator;
import sistema.entidade.Cliente;
import sistema.service.ClienteService;


@ManagedBean
@ViewScoped
public class ClienteBean {

	private Cliente cliente = new Cliente();
	
	private ClienteService service;
	
	@PostConstruct
	public void initService(){
		service = CDIServiceLocator.getBean(ClienteService.class);
	}
	
	public String salvar() {
		if (!cliente.isPersisted()) {
			service.salvar(cliente);
		}
		
		cliente = new Cliente();

		return "sistema.xhtml";
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	
	
	
	
	
}
