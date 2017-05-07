package sistema.cruzeirao.campeonato;

import java.util.List;

import sistema.cruzeirao.funcao.Jogador;

public class Inscrito {
	private Equipe equipe;
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

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
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
