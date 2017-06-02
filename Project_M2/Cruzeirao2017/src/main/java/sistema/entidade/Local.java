package sistema.entidade;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

import sistema.entidade.abstracts.AbstractEntity;

@Entity
public class Local extends AbstractEntity {

	private static final long serialVersionUID = 1L;
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
	public String toString() {
		return nome;
	}
	
}
