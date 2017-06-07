package sistema.entidade;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

import sistema.entidade.Categoria;
import sistema.entidade.abstracts.AbstractEntity;

@Entity
public class Campeonato extends AbstractEntity{

	private static final long serialVersionUID = 1L;

	private String nome;
	@ManyToMany
	private List<Local> locais = new ArrayList<Local>();
	@OneToMany
	private List<Juiz> juizes = new ArrayList<Juiz>();
	@ManyToMany
	private List<Categoria> categorias = new ArrayList<Categoria>();
	@Temporal(TemporalType.DATE)
	private Date dataInicioInscricao;
	@Temporal(TemporalType.DATE)
	private Date dataFimFimInscricao;
	@Temporal(TemporalType.DATE)
	private Date dataInicioCampeonato;
	@Temporal(TemporalType.DATE)
	private Date dataFimCampeonato;
	private double valorTaxa;
	private byte[] foto;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Local> getLocais() {
		return locais;
	}

	public void setLocais(List<Local> locais) {
		this.locais = locais;
	}

	public List<Juiz> getJuizes() {
		return juizes;
	}

	public void setJuizes(List<Juiz> juizes) {
		this.juizes = juizes;
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

	public Date getDataInicioInscricao() {
		return dataInicioInscricao;
	}

	public void setDataInicioInscricao(Date dataInicioInscricao) {
		this.dataInicioInscricao = dataInicioInscricao;
	}

	public Date getDataFimFimInscricao() {
		return dataFimFimInscricao;
	}

	public void setDataFimFimInscricao(Date dataFimFimInscricao) {
		this.dataFimFimInscricao = dataFimFimInscricao;
	}

	public Date getDataInicioCampeonato() {
		return dataInicioCampeonato;
	}

	public void setDataInicioCampeonato(Date dataInicioCampeonato) {
		this.dataInicioCampeonato = dataInicioCampeonato;
	}

	public Date getDataFimCampeonato() {
		return dataFimCampeonato;
	}

	public void setDataFimCampeonato(Date dataFimCampeonato) {
		this.dataFimCampeonato = dataFimCampeonato;
	}

	public double getValorTaxa() {
		return valorTaxa;
	}

	public void setValorTaxa(double valorTaxa) {
		this.valorTaxa = valorTaxa;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public StreamedContent getImage() throws IOException {
		// sua regra para carregar os bytes
		return new DefaultStreamedContent(new ByteArrayInputStream(foto));
	}

	@Override
	public String toString() {
		return "Campeonato [nome=" + nome + "]";
	}

}
