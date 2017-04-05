package cruzeirao.campeonato;

import java.util.ArrayList;
import java.util.List;

import cruzeirao.pessoa.Assistente;
import cruzeirao.pessoa.Diretor;
import cruzeirao.pessoa.Preparador;

public class Time {
	private Diretor diretor;
	private Assistente auxiliar;
	private Preparador preparador;
	private List<Inscricao> atual;
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
	public List<Inscricao> getAtual() {
		return atual;
	}
	public void setAtual(List<Inscricao> atual) {
		this.atual = atual;
	}
	public void addInscricao(Inscricao inscricao)
	{
		atual.add(inscricao);
	}
	public Time (Diretor diretor)
	{
		this.diretor=diretor;
		atual = new ArrayList<Inscricao>(); 
	}
}
