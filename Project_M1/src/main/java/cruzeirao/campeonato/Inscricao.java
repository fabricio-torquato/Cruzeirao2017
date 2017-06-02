package cruzeirao.campeonato;

import java.util.List;

import cruzeirao.pessoa.Jogador;

public class Inscricao {
	private Time time;
	private List<Jogador> jogadores;
	private int pontos;
	private Categoria categoria;
	private boolean validação;
	private List<Jogo> jogos;
	private boolean pagamento;
	
	public boolean isPagamento() {
		return pagamento;
	}

	public void setPagamento(boolean pagamento) {
		this.pagamento = pagamento;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
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

	public void addJogo(Jogo jogo) {
		jogos.add(jogo);
	}

	public void addJogador(Jogador jogador) {
		jogadores.add(jogador);
	}
}
