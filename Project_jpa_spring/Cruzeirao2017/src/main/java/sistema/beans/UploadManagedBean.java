package sistema.beans;


import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

@ManagedBean
@SessionScoped
public class UploadManagedBean {

	private StreamedContent imagem=null;
	
	public byte[] handleFileUpload(FileUploadEvent event) {
		byte[] foto = null;
		try {
			setImagem(new DefaultStreamedContent(event.getFile().getInputstream()));
			foto = event.getFile().getContents();
		} catch (IOException ex) {
			
		}
		return foto;
	}
	public StreamedContent getImagem() {
		return imagem;
	}
	public void setImagem(StreamedContent imagem) {
		this.imagem = imagem;
	}
}
