package sistema.cruzeirao.funcao;

import sistema.cruzeirao.campeonato.Inscrito;

public class Jogador extends Membro {
	private boolean participando;
	private Inscrito time;	
	
	public boolean isParticipando() {
		return participando;
	}

	public void setParticipando(boolean participando) {
		this.participando = participando;
	}
	
	public Inscrito getTime() {
		return time;
	}
	
	public void setTime(Inscrito time) {
		this.time = time;
	}
}
