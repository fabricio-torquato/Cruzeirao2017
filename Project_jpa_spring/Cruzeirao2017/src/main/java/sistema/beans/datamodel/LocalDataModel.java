package sistema.beans.datamodel;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import sistema.entidade.Local;
import sistema.service.LocalService;

public class LocalDataModel extends ListDataModel<Local> implements SelectableDataModel<Local>  {

	private LocalService service = new LocalService(); 
	
	public LocalDataModel() {

	}
	public LocalDataModel(List<Local> list){
		super(list);
	}
	
	@Override
	public Object getRowKey(Local object) {
			return object.getCodigoLocal();
	}

	@Override
	public Local getRowData(String rowKey) {
		for(Local l: service.getLocals())
			   if(Integer.parseInt(rowKey) ==  l.getCodigoLocal())
				   return l;
			return null;
	}
}
