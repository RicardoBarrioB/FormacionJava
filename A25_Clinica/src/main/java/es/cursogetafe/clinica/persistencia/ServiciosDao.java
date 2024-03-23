package es.cursogetafe.clinica.persistencia;

import java.util.Set;

import es.cursogetafe.clinica.modelo.Medicos;
import es.cursogetafe.clinica.modelo.Servicios;

public interface ServiciosDao {
	
	void insertarServicio(Servicios s);	
	
	Servicios eliminar(int idServicios);
	
	boolean eliminar(Servicios s);
	
	void modificar(Servicios s);
	
	Set<Servicios> listarTodos();
	
	Set<Medicos> medicosDelServicio(Servicios s);
	
	Servicios buscar(int idServicios);
	
	Medicos jefeServicio(Servicios s);
}
