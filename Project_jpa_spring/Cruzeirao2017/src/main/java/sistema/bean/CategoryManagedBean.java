package sistema.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.RowEditEvent;

import sistema.entidade.Categoria;
import sistema.service.CategoryService;



@ManagedBean
@ViewScoped
public class CategoryManagedBean {

	private Categoria category = new Categoria();
	private List<Categoria> categorys;
	private CategoryService service = new CategoryService();

	// Edição de um Local na tabela
	public void onRowEdit(RowEditEvent event) {

		Categoria a = ((Categoria) event.getObject());
		service.update(a);
	}

	public void save() {
		category = service.save(category);

		if (categorys != null)
			categorys.add(category);

		category = new Categoria();
	}

	public Categoria getCategory() {
		return category;
	}

	public void setCategory(Categoria category) {
		this.category = category;
	}

	public List<Categoria> getCategorys() {
		if (categorys == null)
			categorys = service.getCategorys();
		return categorys;
	}

	public void delete(Categoria a) {
		service.remove(a);
		categorys.remove(a);
	}
}
