package cruzeirao.campeonato;

import java.util.Date;

import cruzeirao.pessoa.Jogador;

public class Cartao {
	private String CorCart�o;
	private Jogador jogador;
	private Jogo jogo;
	private Date tempo;
	public String getCorCart�o() {
		return CorCart�o;
	}
	public void setCorCart�o(String corCart�o) {
		CorCart�o = corCart�o;
	}
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
	
	public Cartao(String cor,Jogador jogador,Jogo jogo,Date tempo)
	{
		this.CorCart�o=cor;
		this.jogador=jogador;
		this.jogo=jogo;
		this.tempo=tempo;
	}

}
