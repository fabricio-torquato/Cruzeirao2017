package sistema.beans;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.event.RowEditEvent;

import sistema.beans.datamodel.CampeonatoDataModel;
import sistema.entidade.Campeonato;
import sistema.entidade.Categoria;
import sistema.entidade.Local;
import sistema.service.CategoryService;
import sistema.service.ChampionshipService;
import sistema.service.LocalService;

@ManagedBean
@SessionScoped
public class ChampionshipManagedBean extends UploadManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Campeonato champ = new Campeonato();
	private ChampionshipService serviceChamp = new ChampionshipService();
	private CategoryService serviceCategory = new CategoryService();
	private LocalService serviceLocal = new LocalService();

	public void onRowEdit(RowEditEvent event) {

		Campeonato a = ((Campeonato) event.getObject());
		serviceChamp.update(a);
	}

	public void salvar() {/*
		for(Categoria categoria : champ.getCategorias())
			categoria.getCampeonatos().add(champ);
		for(Local local : champ.getLocais())
			local.getCampeonatos().add(champ);*/
		champ = serviceChamp.save(champ);
		champ = new Campeonato();
	}

	public void delete(Campeonato a) {
		serviceChamp.remove(a);
	}

	public void uploadImage(FileUploadEvent event) {
		champ.setFoto(handleFileUpload(event));
	}

	public Campeonato getChamp() {
		return champ;
	}

	public void setChamp(Campeonato champ) {
		this.champ = champ;
	}

	public CampeonatoDataModel getChampionships() {
		return new CampeonatoDataModel(serviceChamp.getChamps());
	}

	public List<Categoria> getCategorias() {
		return serviceCategory.getCategorys();
	}

	public List<Local> getLocais() {
		return serviceLocal.getLocals();
	}
}
