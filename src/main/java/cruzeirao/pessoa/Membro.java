package cruzeirao.pessoa;

import java.awt.Image;
import java.util.Date;

public class Membro {
	private String rg;
	private Date nascimento;
	private String cpf; 
	private Image fotoMembro;

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Image getFotoMembro() {
		return fotoMembro;
	}
	public void setFotoMembro(Image fotoMembro) {
		this.fotoMembro = fotoMembro;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
}
