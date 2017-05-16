package sistema.service;

import java.util.List;

import sistema.dao.ChampionshipDAO;
import sistema.entidade.Campeonato;
import sistema.entidade.Local;

public class ChampionshipService {
	ChampionshipDAO champDAO = new ChampionshipDAO();

	public Campeonato save(Campeonato campeonato){
		campeonato = champDAO.salvar(campeonato);
		champDAO.closeEntityManager();
		return campeonato;
	}

	public List <Campeonato> getChamps()
	{
		List <Campeonato> list =  champDAO.getAll(Campeonato.class);
		champDAO.closeEntityManager();
		return list;
	}
	public void update(Campeonato campeonato)
	{
		champDAO.salvar(campeonato);
		champDAO.closeEntityManager();
	}
	public void remove(Campeonato campeonato)
	{
		campeonato = champDAO.getById(Campeonato.class, campeonato.getCodigoCampeonato());
		champDAO.remover(campeonato);
		champDAO.closeEntityManager();
	}	
}
