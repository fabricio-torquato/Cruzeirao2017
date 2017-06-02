package sistema.beans.Converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import sistema.entidade.Categoria;
import sistema.service.CategoryService;


@FacesConverter("converterCategoria")
public class CategoriaConverter implements Converter{

	private CategoryService servico = new CategoryService();
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (value != null && !value.isEmpty()) {
			
			  for(Categoria c : servico.getCategorys())
				 if(c.getNome().equals(value))
				  	return c;
					
		}

		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value instanceof Categoria && value !=null)
			return ((Categoria) value).getNome();
		return null;
	}

}
