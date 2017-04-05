package cruzeirao.pessoa;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private String nome;
	private String email;
	private String senha;
	List<Membro> papeis;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public List<Membro> getPapeis() {
		return papeis;
	}
	public void addPapeis(Membro papel) {
		papeis.add(papel);
	}
	public Usuario(String nome,String email,String senha)
	{
		papeis = new ArrayList<Membro>();
		this.nome=nome;
		this.email=email;
		this.senha=senha;
	}

}
