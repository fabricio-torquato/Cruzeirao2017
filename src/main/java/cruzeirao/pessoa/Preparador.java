package cruzeirao.pessoa;


import java.util.Date;

import cruzeirao.campeonato.Time;

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

	public Preparador(int rg, Date nascimento,Time time,int crefito) {
		super(rg, nascimento);
		this.time=time;
		this.crefito=crefito;
	}
	
}
