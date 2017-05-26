package sistema.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.event.RowEditEvent;
import org.primefaces.model.DualListModel;

import sistema.beans.datamodel.CampeonatoDataModel;
import sistema.entidade.Campeonato;
import sistema.entidade.Categoria;
import sistema.entidade.Local;
import sistema.service.CategoryService;
import sistema.service.ChampionshipService;
import sistema.service.LocalService;

@ManagedBean
@ViewScoped
public class ChampionshipManagedBean extends UploadManagedBean{

	private Campeonato champ = new Campeonato();
	private Campeonato champSelecionado = new Campeonato();
	private ChampionshipService serviceChamp = new ChampionshipService();	
	private CategoryService serviceCategory = new CategoryService();
	private LocalService serviceLocal = new LocalService();
	private DualListModel<Categoria> dualListCategoria = new DualListModel<>();
	private DualListModel<Local> dualListLocal = new DualListModel<>();
	
	public void onRowEdit(RowEditEvent event) {

		Campeonato a = ((Campeonato) event.getObject());
		serviceChamp.update(a);
	}
	public void salvar() {
		champ = serviceChamp.save(champ);
		champ = new Campeonato();
	}
	public void addCategoriaToCampeonato(){
		champSelecionado = champ;
	}
	public void addLocalToCampeonato(){
		champSelecionado = champ;
	}
	public DualListModel<Categoria> getCategorias(){
		List<Categoria> source = new ArrayList<Categoria>();
		List<Categoria> target = new ArrayList<Categoria>();
		
		source.addAll(serviceCategory.getCategorys());
		
		if(champSelecionado != null){
			target.addAll(champSelecionado.getCategorias());
			source.removeAll(champSelecionado.getCategorias());
		}
		dualListCategoria.setSource(source);
		dualListCategoria.setTarget(target);
		
		return dualListCategoria;
	}
	public DualListModel<Local> getLocais(){
		List<Local> source = new ArrayList<Local>();
		List<Local> target = new ArrayList<Local>();
		
		source.addAll(serviceLocal.getLocals());
		
		if(champSelecionado != null){
			target.addAll(champSelecionado.getLocais());
			source.removeAll(champSelecionado.getLocais());
		}
		dualListLocal.setSource(source);
		dualListLocal.setTarget(target);
		
		return dualListLocal;
	}
	public void setCategorias(DualListModel<Categoria> categorias){
		this.dualListCategoria = categorias;
	}
	public void setLocais(DualListModel<Local> locais){
		this.dualListLocal = locais;
	}
	public void delete(Campeonato a) {
		serviceChamp.remove(a);
	}
	public void uploadImage(FileUploadEvent event) {
		champ.setFoto(handleFileUpload(event));
	}
	public void associar(){
		for(Categoria c : dualListCategoria.getSource())
			c.getCampeonatos().remove(champSelecionado);
		for(Categoria c : dualListCategoria.getTarget())
			c.getCampeonatos().add(champSelecionado);
		
		for(Local l : dualListLocal.getSource())
			l.getCampeonatos().remove(champSelecionado);
		for(Local l : dualListLocal.getTarget())
			l.getCampeonatos().add(champSelecionado);
		
		champSelecionado.getCategorias().clear();
		champSelecionado.getCategorias().addAll(dualListCategoria.getTarget());
		
		champSelecionado.getLocais().clear();
		champSelecionado.getLocais().addAll(dualListLocal.getTarget());
		
		serviceChamp.update(champSelecionado);
		
		champSelecionado.getCategorias().clear();	
		champSelecionado.getLocais().clear();
	}
	public Campeonato getChamp() {
		return champ;
	}
	public Campeonato getChampSelecionado() {
		return champSelecionado;
	}
	public void setChamp(Campeonato champ) {
		this.champ = champ;
	}
	public void setChampSelecionado(Campeonato champSelecionado) {
		this.champSelecionado = champSelecionado;
	}
	public CampeonatoDataModel getChampionships(){
		return new CampeonatoDataModel(serviceChamp.getChamps());
	}
	
}
