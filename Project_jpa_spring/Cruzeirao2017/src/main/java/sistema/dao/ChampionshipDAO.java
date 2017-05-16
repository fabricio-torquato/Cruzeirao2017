package sistema.dao;

import sistema.entidade.Campeonato;
public class ChampionshipDAO extends GenericDAO<Campeonato, Integer>{

	@Override
	protected Class<Campeonato> getClasseEntidade() {
		return Campeonato.class;
	}

}
