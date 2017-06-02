package sistema.entidade;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

import sistema.entidade.enums.Genero;
import sistema.entidade.enums.Roles;
import sistema.entidade.enums.Tipo;

@Entity
@NamedQuery(name = "Usuario.pesquisarPorUserName", query = "select u from Usuario u where u.username = :username")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 6360850095345609468L;

	public static final String PESQUISAR_POR_USERNAME = "Usuario.pesquisarPorUserName";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String username;
	private String password;
	private String name;
	private String dataNascimento;
	private List<Equipe> equipes = new ArrayList<>();
	private List<Inscrito> inscricoes = new ArrayList<>();
	private List<Campeonato> campeoantos = new ArrayList<>();
	private List<Tipo> tipo;
	private String telefoneFixo;
	private String telefoneMovel;
	private String endereco;
	private String rg;
	private String cpf;
	private String cref;
	private Genero genero;
	private Roles role;
	private byte[] foto;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Roles getRole() {
		return role;
	}

	public void setRole(Roles role) {
		this.role = role;
	}
	public Roles[] getRoles(){
		return Roles.values();
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public List<Equipe> getEquipes() {
		return equipes;
	}

	public void setEquipes(List<Equipe> equipes) {
		this.equipes = equipes;
	}

	public List<Inscrito> getInscricoes() {
		return inscricoes;
	}

	public void addEquipe(Equipe equipe) {
		equipes.add(equipe);
	}

	public void setInscricoes(List<Inscrito> inscricoes) {
		this.inscricoes = inscricoes;
	}

	public void addInscrito(Inscrito inscrito) {
		inscricoes.add(inscrito);
	}

	public List<Campeonato> getCampeoantos() {
		return campeoantos;
	}

	public void addCampeonato(Campeonato campeonato) {
		campeoantos.add(campeonato);
	}

	public void setCampeoantos(List<Campeonato> campeoantos) {
		this.campeoantos = campeoantos;
	}

	public String getTelefoneFixo() {
		return telefoneFixo;
	}

	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}

	public String getTelefoneMovel() {
		return telefoneMovel;
	}

	public void setTelefoneMovel(String telefoneMovel) {
		this.telefoneMovel = telefoneMovel;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCref() {
		return cref;
	}

	public void setCref(String cref) {
		this.cref = cref;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Genero[] getGeneros() {
		return Genero.values();
	}
	public List<Tipo> getTipo() {
		return tipo;
	}

	public void setTipo(List<Tipo> tipo) {
		this.tipo = tipo;
	}
	public Tipo[] getTipos(){
		return Tipo.values();
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
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", role=" + role + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		Usuario other = (Usuario) obj;
		if (id != other.id)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

}
