package sistema.entidade;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Categoria implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoCategoria;
	private String nome;
	private int nascidosApartirDe;
	
	@OneToMany(mappedBy="categoria")
	private ArrayList<Inscricao> inscricoes= new ArrayList<Inscricao>();
	@ManyToOne
	private Campeonato campeonato;
	
	@OneToMany(mappedBy="categoria")
	private ArrayList<Fase> fases =  new ArrayList<Fase>();;
	
	private int minJogadores;
	private int maxJogadores;
	//TODO CRIAR ENUMprivate Sexo sexo; 

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNascidosApartirDe() {
		return nascidosApartirDe;
	}
	public void setNascidosApartirDe(int nascidosApartirDe) {
		this.nascidosApartirDe = nascidosApartirDe;
	}
	public ArrayList<Inscricao> getInscricoes() {
		return inscricoes;
	}
	public void setInscricoes(ArrayList<Inscricao> inscricoes) {
		this.inscricoes = inscricoes;
	}
	public Campeonato getCampeonato() {
		return campeonato;
	}
	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}
	public ArrayList<Fase> getFases() {
		return fases;
	}
	public void setFases(ArrayList<Fase> fases) {
		this.fases = fases;
	}
	public int getMinJogadores() {
		return minJogadores;
	}
	public void setMinJogadores(int minJogadores) {
		this.minJogadores = minJogadores;
	}
	public int getMaxJogadores() {
		return maxJogadores;
	}
	public void setMaxJogadores(int maxJogadores) {
		this.maxJogadores = maxJogadores;
	}

	public int getCodigoCategoria() {
		return codigoCategoria;
	}

	public void setCodigoCategoria(int codigoCategoria) {
		this.codigoCategoria = codigoCategoria;
	}
}
