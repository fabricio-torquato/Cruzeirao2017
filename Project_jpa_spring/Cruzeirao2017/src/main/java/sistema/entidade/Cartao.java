package sistema.entidade;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Cartao implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoCartao;
	@ManyToOne
	private Inscrito inscrito;
	
	//TODO CRIAR ENUM private TipoCartao tipo;
	private int Tempo;
	
	public Inscrito getInscrito() {
		return inscrito;
	}
	public void setInscrito(Inscrito inscrito) {
		this.inscrito = inscrito;
	}
	public int getTempo() {
		return Tempo;
	}
	public void setTempo(int tempo) {
		Tempo = tempo;
	}
	public int getCodigoCartao() {
		return codigoCartao;
	}
	public void setCodigoCartao(int codigoCartao) {
		this.codigoCartao = codigoCartao;
	}
	
}
