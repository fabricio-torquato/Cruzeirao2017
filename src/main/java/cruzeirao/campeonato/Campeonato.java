package cruzeirao.campeonato;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Campeonato {
	private int ano;
	private Date inicio;
	private Date fim;
	private Date inicio_inscricao;
	private Date final_inscricao;
	private double valor_inscricao;
	private int min_jogador;
	private int max_jogador;
	private List<Categoria> categorias;
	private List<Local> locais;
	public void addLocal(Local local)
	{
		locais.add(local);
	}
	public List<Local> getLocais() {
		return locais;
	}
	public void setLocais(List<Local> locais) {
		this.locais = locais;
	}
	public List<Categoria> getCategorias() {
		return categorias;
	}
	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public Date getInicio() {
		return inicio;
	}
	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}
	public Date getFim() {
		return fim;
	}
	public void setFim(Date fim) {
		this.fim = fim;
	}
	public Date getInicio_inscricao() {
		return inicio_inscricao;
	}
	public void setInicio_inscricao(Date inicio_inscricao) {
		this.inicio_inscricao = inicio_inscricao;
	}
	public Date getFinal_inscricao() {
		return final_inscricao;
	}
	public void setFinal_inscricao(Date final_inscricao) {
		this.final_inscricao = final_inscricao;
	}
	public double getValor_inscricao() {
		return valor_inscricao;
	}
	public void setValor_inscricao(double valor_inscricao) {
		this.valor_inscricao = valor_inscricao;
	}
	public int getMin_jogador() {
		return min_jogador;
	}
	public void setMin_jogador(int min_jogador) {
		this.min_jogador = min_jogador;
	}
	public int getMax_jogador() {
		return max_jogador;
	}
	public void setMax_jogador(int max_jogador) {
		this.max_jogador = max_jogador;
	}
	public void addCategoria(int idade,String sexo,int min)
	{
	categorias.add(new Categoria(idade,sexo,min));
	}
	public Campeonato(int ano,Date inicio,Date fim)
	{
		this.categorias=new ArrayList<Categoria>();
		this.ano=ano;
		this.inicio=inicio;
		this.fim=fim;
	}
}
