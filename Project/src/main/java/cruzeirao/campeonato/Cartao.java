package cruzeirao.campeonato;

import java.util.Date;

import cruzeirao.pessoa.Jogador;

public class Cartao {
	private String CorCartão;
	private Jogador jogador;
	private Jogo jogo;
	private Date tempo;
	public String getCorCartão() {
		return CorCartão;
	}
	public void setCorCartão(String corCartão) {
		CorCartão = corCartão;
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
		this.CorCartão=cor;
		this.jogador=jogador;
		this.jogo=jogo;
		this.tempo=tempo;
	}

}
