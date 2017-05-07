package sistema.cruzeirao.funcao;

import sistema.cruzeirao.campeonato.Equipe;

public class Assistente extends Membro{
	int cref;
	Equipe time;
	
	public int getCref() {
		return cref;
	}

	public void setCref(int cref) {
		this.cref = cref;
	}

	public Equipe getTime() {
		return time;
	}

	public void setTime(Equipe time) {
		this.time = time;
	}


}
