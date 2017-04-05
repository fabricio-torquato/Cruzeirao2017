package cruzeirao.pessoa;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Diretor extends Membro{
	List<Time> times;
	
	public List<Time> getTimes() {
		return times;
	}
	
	public void setTimes(List<Time> times) {
		this.times = times;
	}
	public void addTime(Time time)
	{
		times.add(time);
	}

}
