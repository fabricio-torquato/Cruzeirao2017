package cruzeirao.pessoa;


import java.util.Date;

import cruzeirao.campeonato.Time;

public class Auxiliar extends Membro{
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

	public Auxiliar(int rg, Date nascimento,int cref,Time time) {
		super(rg, nascimento);
		this.cref=cref;
		this.time=time;
	}

}
