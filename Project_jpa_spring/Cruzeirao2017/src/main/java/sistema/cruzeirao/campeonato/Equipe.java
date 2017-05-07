package sistema.cruzeirao.campeonato;

import java.util.List;

import sistema.cruzeirao.funcao.*;

public class Equipe {
	private Diretor diretor;
	private Assistente auxiliar;
	private Preparador preparador;
	private List<Inscrito> atual;
	private String nome;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Diretor getDiretor() {
		return diretor;
	}
	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}
	public Assistente getAuxiliar() {
		return auxiliar;
	}
	public void setAuxiliar(Assistente auxiliar) {
		this.auxiliar = auxiliar;
	}
	public Preparador getPreparador() {
		return preparador;
	}
	public void setPreparador(Preparador preparador) {
		this.preparador = preparador;
	}
	public List<Inscrito> getAtual() {
		return atual;
	}
}
