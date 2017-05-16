package sistema.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.RowEditEvent;

import sistema.entidade.Campeonato;
import sistema.service.ChampionshipService;

@ManagedBean
@ViewScoped
public class ChampionshipManagedBean {

	private Campeonato champ = new Campeonato();
	private List<Campeonato> champs;
	private ChampionshipService service = new ChampionshipService(); 
	
	public void onRowEdit(RowEditEvent event) {

		Campeonato a = ((Campeonato) event.getObject());
		service.update(a);
	}
	public void save() {
		champ = service.save(champ);
		
		if (champs != null)
			champs.add(champ);
		
		champ = new Campeonato();
	}

	public Campeonato getChamp() {
		return champ;
	}

	public void setChamp(Campeonato champ) {
		this.champ = champ;
	}

	public List<Campeonato> getChamps() {
		if (champs == null)
			champs = service.getChamps();
		return champs;
	}

	public void delete(Campeonato a) {
		service.remove(a);
		champs.remove(a);
	}
	
	public String detailInfo(Campeonato a){
		champ = a;
		return "LINKPARAOOUTRO SITE";
	}
	public ChampionshipService getService() {
		return service;
	}
	public void setService(ChampionshipService service) {
		this.service = service;
	}
	public void setChamps(List<Campeonato> champs) {
		this.champs = champs;
	}
	
	
}
