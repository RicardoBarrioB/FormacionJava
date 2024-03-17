package es.cursogetafe.springxml.persistencia;

public class ClienteDaoImplNew implements ClienteDao {

	public ClienteDaoImplNew() {
		System.out.println("Constructor de ClienteDaoImplNew");
	}

	@Override
	public void metodoDao() {
		System.out.println("metodoDao de ClienteDaoImplNew");
	}

}
