package sistema.beans.datamodel;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import sistema.entidade.Categoria;
import sistema.service.CategoryService;

public class CategoryDataModel extends ListDataModel<Categoria> implements SelectableDataModel<Categoria>  {

	private CategoryService service = new CategoryService(); 
	
	public CategoryDataModel() {

	}
	public CategoryDataModel(List<Categoria> list){
		super(list);
	}
	
	@Override
	public Object getRowKey(Categoria object) {
			return object.getId();
	}

	@Override
	public Categoria getRowData(String rowKey) {
		for(Categoria c: service.getCategorys())
			   if(Integer.parseInt(rowKey) ==  c.getId())
				   return c;
			return null;
	}

}
