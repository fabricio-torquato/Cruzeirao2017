package sistema.cruzeirao.campeonato;

import java.util.Date;

import sistema.cruzeirao.funcao.Jogador;

public class Gol {
	private Jogador jogador;
	private Jogo jogo;
	private Date tempo;
	
	public Jogador getJogador() {
		return jogador;
	}
	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}
	public Jogo getJogo() {
		return jogo;
	}
	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}
	public Date getTempo() {
		return tempo;
	}
	public void setTempo(Date tempo) {
		this.tempo = tempo;
	}
	
	public Gol(Jogador jogador,Jogo jogo,Date tempo)
	{
		this.jogador=jogador;
		this.jogo=jogo;
		this.tempo=tempo;
	}
}
