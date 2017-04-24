package sistema.cruzeirao.pessoa;

import sistema.cruzeirao.campeonato.Inscricao;

public class Jogador extends Membro {
	private boolean participando;
	private Inscricao time;	
	
	public boolean isParticipando() {
		return participando;
	}

	public void setParticipando(boolean participando) {
		this.participando = participando;
	}
	
	public Inscricao getTime() {
		return time;
	}
	
	public void setTime(Inscricao time) {
		this.time = time;
	}
}
