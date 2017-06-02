package sistema.entidade;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import sistema.entidade.abstracts.AbstractEntity;
import sistema.entidade.enums.Genero;

@Entity
public class Categoria  extends AbstractEntity{

	private static final long serialVersionUID = 1L;
	private String nome;
	private int nascidosApartirDe;
	
	@OneToMany(mappedBy="categoria")
	private List<Inscricao> inscricoes= new ArrayList<Inscricao>();
	
	@ManyToMany(mappedBy="categorias")
	private List<Campeonato> campeonatos = new ArrayList<>();
	
	@OneToMany(mappedBy="categoria")
	private List<Fase> fases =  new ArrayList<Fase>();;
	
	private int minJogadores;
	private int maxJogadores;
	private Genero genero;

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
	public List<Inscricao> getInscricoes() {
		return inscricoes;
	}
	public void setInscricoes(List<Inscricao> inscricoes) {
		this.inscricoes = inscricoes;
	}
	public List<Campeonato> getCampeonatos() {
		return campeonatos;
	}
	public void setCampeonatos(List<Campeonato> campeonatos) {
		this.campeonatos = campeonatos;
	}
	public List<Fase> getFases() {
		return fases;
	}
	public void setFases(List<Fase> fases) {
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
	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public Genero[] getGeneros() {
		return Genero.values();
	}

	@Override
	public String toString() {
		return nome;
	}
	
}
