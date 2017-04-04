package cruzeirao.campeonato;

import java.util.ArrayList;
import java.util.List;

import cruzeirao.pessoa.Auxiliar;
import cruzeirao.pessoa.Diretor;
import cruzeirao.pessoa.Preparador;

public class Time {
	Diretor diretor;
	Auxiliar auxiliar;
	Preparador preparador;
	List<Inscricao> atual;
	public Diretor getDiretor() {
		return diretor;
	}
	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}
	public Auxiliar getAuxiliar() {
		return auxiliar;
	}
	public void setAuxiliar(Auxiliar auxiliar) {
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
