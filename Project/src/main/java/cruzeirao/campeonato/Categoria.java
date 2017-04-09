package cruzeirao.campeonato;

import java.util.List;


public class Categoria {
	private int idade_min;
	private String sexo;
	private int min_time;
	private List<Inscricao> times;
	public int getIdade_min() {
		return idade_min;
	}
	public void setIdade_min(int idade_min) {
		this.idade_min = idade_min;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getMin_time() {
		return min_time;
	}
	public void setMin_time(int min_time) {
		this.min_time = min_time;
	}
	public List<Inscricao> getTimes() {
		return times;
	}
	public void setTimes(List<Inscricao> times) {
		this.times = times;
	}
}
