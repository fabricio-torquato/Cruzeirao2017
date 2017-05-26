package sistema.service;

import java.util.List;

import sistema.dao.ChampionshipDAO;
import sistema.entidade.Campeonato;
import sistema.entidade.Categoria;
import sistema.entidade.Local;

public class ChampionshipService {
	ChampionshipDAO champDAO = new ChampionshipDAO();

	public Campeonato save(Campeonato campeonato) {
		campeonato = champDAO.salvar(campeonato);
		champDAO.closeEntityManager();
		return campeonato;
	}

	public List<Campeonato> getChamps() {
		List<Campeonato> list = champDAO.getAll(Campeonato.class);
		champDAO.closeEntityManager();
		return list;
	}

	public void update(Campeonato campeonato) {
		champDAO.salvar(campeonato);
		champDAO.closeEntityManager();
	}

	public void remove(Campeonato campeonato) {
		campeonato = champDAO.getById(Campeonato.class, campeonato.getId());
		champDAO.remover(campeonato);
		champDAO.closeEntityManager();
	}
	public List<Categoria> getCategoriasCampeonato(Campeonato campeonatoSelecionado){
		List<Categoria> list = champDAO.getCategoriasCampeonatos(campeonatoSelecionado);
		champDAO.closeEntityManager();
		return list;
	}
	public List<Local> getLocaisCampeonato(Campeonato campeonatoSelecionado){
		List<Local> list = champDAO.getLocaisCampeonatos(campeonatoSelecionado);
		champDAO.closeEntityManager();
		return list;
	}
}
