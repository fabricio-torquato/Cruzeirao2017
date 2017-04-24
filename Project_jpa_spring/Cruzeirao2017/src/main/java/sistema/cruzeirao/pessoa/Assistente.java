package sistema.cruzeirao.pessoa;

import sistema.cruzeirao.campeonato.Time;

public class Assistente extends Membro{
	int cref;
	Time time;
	
	public int getCref() {
		return cref;
	}

	public void setCref(int cref) {
		this.cref = cref;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}


}
