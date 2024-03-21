package es.cursogetafe.springxml.persistencia;

import org.springframework.stereotype.Repository;

//@Component("cDaoBean") -- Generico
@Repository("cDaoBean") //-- estereotipo de component
public class ClienteDaoImpl implements ClienteDao {
	
	public ClienteDaoImpl() {
		System.out.println("Constructor de ClienteDaoImpl");
	}

	@Override
	public void metodoDao() {
		System.out.println("metodoDao de ClienteDaoImpl");
	}

}
