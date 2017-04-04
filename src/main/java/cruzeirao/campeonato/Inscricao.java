package cruzeirao.campeonato;

import cruzeirao.pessoa.Tecnico;

import java.util.ArrayList;
import java.util.List;

import cruzeirao.pessoa.Jogador;
public class Inscricao {
	private Time time;
	private Tecnico tecnico;
	private List<Jogador> jogadores;
	private int pontos;
	private Categoria categoria;
	private boolean validação;
	private List<Jogo> jogos;
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public Tecnico getTecnico() {
		return tecnico;
	}
	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}
	public List<Jogador> getJogadores() {
		return jogadores;
	}
	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public boolean isValidação() {
		return validação;
	}
	public void setValidação(boolean validação) {
		this.validação = validação;
	}
	public List<Jogo> getJogos() {
		return jogos;
	}
	public void setJogos(List<Jogo> jogos) {
		this.jogos = jogos;
	}
	public void addJogo(Jogo jogo)
	{
		jogos.add(jogo);
	}
	public void addJogador(Jogador jogador)
	{
		jogadores.add(jogador);
	}
	public Inscricao(Time time,Tecnico tecnico,Categoria categoria)
	{
		this.time=time;
		this.tecnico=tecnico;
		this.categoria=categoria;
		jogadores= new ArrayList<Jogador>();
		jogos=new ArrayList<Jogo>();
	}
	}

