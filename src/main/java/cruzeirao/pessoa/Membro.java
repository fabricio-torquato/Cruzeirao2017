package cruzeirao.pessoa;

import java.util.Date;

public class Membro {
	private int rg;
	private Date nascimento;
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public Membro (int rg,Date nascimento)
	{
		this.rg=rg;
		this.nascimento= nascimento;
	}
}
