package sistema.dao;

import java.util.List;

import javax.persistence.EntityManager;

import sistema.entidade.Campeonato;
import sistema.entidade.Categoria;
import sistema.entidade.Local;

public class ChampionshipDAO extends GenericDAO<Campeonato,Integer> {

	@Override
	protected Class<Campeonato> getClasseEntidade() {
		return Campeonato.class;
	}

	public List<Categoria> getCategoriasCampeonatos(Campeonato campeonatoSelecionado) {

		List<Categoria> categorias = null;
		EntityManager em = getEntityManager();
		Campeonato r = em.find(Campeonato.class, campeonatoSelecionado.getId());
		em.refresh(r);
		categorias = r.getCategorias();
		em.close();

		return categorias;
	}
	public List<Local> getLocaisCampeonatos(Campeonato campeonatoSelecionado) {

		List<Local> locais = null;
		EntityManager em = getEntityManager();
		Campeonato r = em.find(Campeonato.class, campeonatoSelecionado.getId());
		em.refresh(r);
		locais = r.getLocais();
		em.close();

		return locais;
	}
}
