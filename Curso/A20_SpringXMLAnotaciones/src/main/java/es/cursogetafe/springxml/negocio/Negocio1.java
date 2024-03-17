package es.cursogetafe.springxml.negocio;

import java.io.Serializable;

import es.cursogetafe.springxml.persistencia.ClienteDao;

public interface Negocio1 extends Serializable{
	
	public void metodoNegocio();
	
	public void setcDao(ClienteDao cDao);
	
	public ClienteDao getcDao();
}
