package sistema.entidade;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

import sistema.entidade.Categoria;

@Entity
public class Campeonato implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Campeonato other = (Campeonato) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
