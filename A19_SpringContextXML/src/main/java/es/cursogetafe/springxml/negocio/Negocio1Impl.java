package es.cursogetafe.springxml.negocio;

import es.cursogetafe.springxml.persistencia.ClienteDao;

public class Negocio1Impl implements Negocio1 {

	private ClienteDao cDao;
	
	public Negocio1Impl() {
		System.out.println("Constructor de Negocio1Impl");
	}

	@Override
	public void metodoNegocio() {
		System.out.println("metodoNegociod de Negocio1Impl");
		cDao.metodoDao();
	}

	public ClienteDao getcDao() {
		return cDao;
	}

	public void setcDao(ClienteDao cDao) {
		System.out.println("se ha inyectado el dao");
		this.cDao = cDao;
	}

}
