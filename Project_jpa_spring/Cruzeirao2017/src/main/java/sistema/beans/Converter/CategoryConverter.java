package sistema.beans.Converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import javax.faces.convert.FacesConverter;

import sistema.entidade.Categoria;
import sistema.service.CategoryService;

@FacesConverter("categoryConverter")
public class CategoryConverter implements Converter{

	private CategoryService service = new CategoryService();
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (value != null && !value.isEmpty()) {
			
			  for(Categoria c : service.getCategorys())
				 if(c.getNome().equals(value))
				  	return c;
					
		}

		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value == null || value.equals("")) {
			return null;
		} else {
			return ((Categoria) value).getNome();

		}
	}
}
