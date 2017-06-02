package sistema.beans.datamodel;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import sistema.entidade.Campeonato;
import sistema.service.ChampionshipService;

public class CampeonatoDataModel  extends ListDataModel<Campeonato> implements SelectableDataModel<Campeonato>  {
	
	private ChampionshipService service = new ChampionshipService();
	
	public CampeonatoDataModel() {

	}
	public CampeonatoDataModel(List <Campeonato> list) {
		super(list);
	}
	@Override
	public Object getRowKey(Campeonato object) {
		return object.getId();
	}

	@Override
	public Campeonato getRowData(String rowKey) {
		for(Campeonato c: service.getChamps())
			   if(Integer.parseInt(rowKey) ==  c.getId())
				   return c;
			return null;
	}
	
	
}
