package cruzeirao.pessoa;


import java.util.Date;

import cruzeirao.campeonato.Time;

public class Tecnico extends Membro {
	private Time time;

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}
	public Tecnico(int rg, Date nascimento,Time time) {
		super(rg, nascimento);
		this.time=time;
	}
	
}
