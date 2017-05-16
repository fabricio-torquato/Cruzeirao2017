package sistema.entidade;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Local implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoLocal;
	private String nome;
	private String endereco;
	private String urlImage;

	public String getUrlImage() {
		return urlImage;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getCodigoLocal() {
		return codigoLocal;
	}

	public void setCodigoLocal(int codigoLocal) {
		this.codigoLocal = codigoLocal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigoLocal;
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Local other = (Local) obj;
		if (codigoLocal != other.codigoLocal)
			return false;

		return true;
	}
}
