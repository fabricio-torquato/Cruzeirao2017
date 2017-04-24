package sistema.cruzeirao.pessoa;

import sistema.cruzeirao.campeonato.Time;

public class Preparador extends Membro{

	private Time time;
	private int crefito;
	
	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public int getCrefito() {
		return crefito;
	}

	public void setCrefito(int crefito) {
		this.crefito = crefito;
	}

}
