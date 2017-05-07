package sistema.cruzeirao.campeonato;

import java.util.Date;
import java.util.List;

public class Jogo {
	private Inscrito ficha1;
	private Inscrito ficha2;
	private double tempo;
	private Local local;
	private Date data;
	private List<Gol> gols;
	private List<Cartao> cartoes;
	
	public Inscrito getFicha1() {
		return ficha1;
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
	public Inscrito getFicha2() {
		return ficha2;
	}
	public void setFicha1(Inscrito ficha1) {
		this.ficha1 = ficha1;
	}
	public void setFicha2(Inscrito ficha2) {
		this.ficha2 = ficha2;
	}
	
}
