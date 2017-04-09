package cruzeirao.campeonato;

import java.util.Date;
import java.util.List;

public class Jogo {
	private Inscricao ficha1;
	private Inscricao ficha2;
	private double tempo;
	private Local local;
	private Date data;
	private List<Gol> gols;
	private List<Cartao> cartoes;
	public Inscricao getFicha1() {
		return ficha1;
	}
	public void setFicha1(Inscricao ficha1) {
		this.ficha1 = ficha1;
	}
	public Inscricao getFicha2() {
		return ficha2;
	}
	public void setFicha2(Inscricao ficha2) {
		this.ficha2 = ficha2;
	}
	public double getTempo() {
		return tempo;
	}
	public void setTempo(double tempo) {
		this.tempo = tempo;
	}
	public Local getLocal() {
		return local;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public List<Gol> getGols() {
		return gols;
	}
	public void setGols(List<Gol> gols) {
		this.gols = gols;
	}
	public void addGol(Gol gol)
	{
		gols.add(gol);
	}
	public List<Cartao> getCartoes() {
		return cartoes;
	}
	public void setCartoes(List<Cartao> cartoes) {
		this.cartoes = cartoes;
	}
	public void addCartoes(Cartao cartao)
	{
		cartoes.add(cartao);
	}
	public Jogo(Inscricao ficha1,Inscricao ficha2,Local local,Date dia)
	{
		this.ficha1=ficha1;
		this.ficha2=ficha2;
		this.local=local;
		this.data=dia;
	}
}
