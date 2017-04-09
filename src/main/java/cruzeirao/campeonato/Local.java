package cruzeirao.campeonato;

import java.awt.Image;

public class Local {
	private String nome;
	private String endereco;
	private String logoCampo;

	
	public String getLogoCampo() {
		return logoCampo;
	}

	public void setLogoCampo(String logoCampo) {
		this.logoCampo = logoCampo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Local(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

}
