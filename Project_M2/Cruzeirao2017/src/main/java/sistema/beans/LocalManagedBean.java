package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.event.RowEditEvent;

import sistema.entidade.Local;
import sistema.service.LocalService;

@ManagedBean
@ViewScoped
public class LocalManagedBean extends UploadManagedBean {
	
	private Local local = new Local();
	private List<Local> locals = null;
	private LocalService service = new LocalService();

	//Edição de um Local na tabela
	public void onRowEdit(RowEditEvent event) {

		Local a = ((Local) event.getObject());
		service.update(a);
	}

	public void save() {
		local = service.save(local);
		
		if (locals != null)
			locals.add(local);
		
		local = new Local();
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public List<Local> getLocals() {
		if (locals == null)
			locals = service.getLocals();
		return locals;
	}

	public void delete(Local a) {
		service.remove(a);
		locals.remove(a);
	}
	
	public void uploadImage(FileUploadEvent event) {
		local.setFoto(handleFileUpload(event));
	}
}
