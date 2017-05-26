package sistema.entidade;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;


@Entity
public class Local implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoLocal;
	private String nome;
	private String endereco;
	private byte[] foto;
	@ManyToMany(mappedBy="locais",fetch=FetchType.EAGER)
	private List<Campeonato> campeonatos = new ArrayList<>();
	
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

	public int getCodigoLocal() {
		return codigoLocal;
	}

	public void setCodigoLocal(int codigoLocal) {
		this.codigoLocal = codigoLocal;
	}
	
	public List<Campeonato> getCampeonatos() {
		return campeonatos;
	}

	public void setCampeonatos(List<Campeonato> campeonatos) {
		this.campeonatos = campeonatos;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	public StreamedContent getImage() throws IOException {
		// sua regra para carregar os bytes
		return new DefaultStreamedContent(new ByteArrayInputStream(foto));
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
