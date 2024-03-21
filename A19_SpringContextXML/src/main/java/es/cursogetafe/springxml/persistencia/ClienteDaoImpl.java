package es.cursogetafe.springxml.persistencia;

public class ClienteDaoImpl implements ClienteDao {
	
	public ClienteDaoImpl() {
		System.out.println("Constructor de ClienteDaoImpl");
	}

	@Override
	public void metodoDao() {
		System.out.println("metodoDao de ClienteDaoImpl");
	}

}
