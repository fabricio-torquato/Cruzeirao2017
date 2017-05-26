package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;

import org.primefaces.event.RowEditEvent;

import sistema.beans.datamodel.CategoryDataModel;
import sistema.entidade.Categoria;
import sistema.service.CategoryService;

@ManagedBean
@SessionScoped
public class CategoryManagedBean {

	private Categoria category = new Categoria();
	private List<Categoria> categorys = null;
	private CategoryService service = new CategoryService();

	// Edição de um Local na tabela
	public void onRowEdit(RowEditEvent event) {

		Categoria a = ((Categoria) event.getObject());
		service.update(a);
	}

	public void salvar() {
		category = service.save(category);
		if(categorys!=null)
			categorys.add(category);
		category = new Categoria();
	}

	public Categoria getCategory() {
		return category;
	}

	public void setCategory(Categoria category) {
		this.category = category;
	}

	public DataModel<Categoria> getCategorys() {
		if (categorys == null)
			categorys = service.getCategorys();

		return new CategoryDataModel(categorys);
	}

	public void delete(Categoria a) {
		service.remove(a);
		categorys.remove(a);
	}
}
