package sistema.entidade.Inheritance;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

public class Imagem implements Serializable{
	private static final long serialVersionUID = 1L;
	private byte[] foto;
	
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
}
