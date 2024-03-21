package es.cursogetafe.springxml.persistencia;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//@Component("cDaoNew") -- Component es el generico
@Repository("cDaoNew") //-- estereotipo de component
public class ClienteDaoImplNew implements ClienteDao {

	@Autowired
	private DataSource ds;
	
	public ClienteDaoImplNew() {
		System.out.println("Constructor de ClienteDaoImplNew");
	}

	@Override
	public void metodoDao() {
		System.out.println("metodoDao de ClienteDaoImplNew");
	}

}
