package sistema.cruzeirao.funcao;

import sistema.cruzeirao.campeonato.Equipe;

public class Preparador extends Membro{

	private Equipe time;
	private int crefito;
	
	public Equipe getTime() {
		return time;
	}

	public void setTime(Equipe time) {
		this.time = time;
	}

	public int getCrefito() {
		return crefito;
	}

	public void setCrefito(int crefito) {
		this.crefito = crefito;
	}

}
