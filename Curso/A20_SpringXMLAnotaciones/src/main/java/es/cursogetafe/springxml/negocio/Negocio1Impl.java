package es.cursogetafe.springxml.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import es.cursogetafe.springxml.persistencia.ClienteDao;

//@Component("neg") -- El generico
@Service("neg") //-- estereotipo de component
public class Negocio1Impl implements Negocio1 {
	
	@Autowired
	@Qualifier("cDaoBean")
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
