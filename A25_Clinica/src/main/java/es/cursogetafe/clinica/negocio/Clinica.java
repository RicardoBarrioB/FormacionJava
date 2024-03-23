package es.cursogetafe.clinica.negocio;

import java.util.Set;

import es.cursogetafe.clinica.modelo.Especialidades;
import es.cursogetafe.clinica.modelo.Medicos;
import es.cursogetafe.clinica.modelo.Servicios;

public interface Clinica {

	void insertarContacto(Medicos m);	
	
	Class<?> eliminar(int id, Class<?> clase);
	
	boolean eliminar(Medicos m);
	
	void modificar(Medicos m);
	
	Set<Medicos> buscarTodos();
	
	Set<Medicos> buscarMedicos(String cadena);
	
	Class<?> buscar(int id, Class<?> clase);
	
	void insertarServicio(Servicios s);	
	
	boolean eliminar(Servicios s);
	
	void modificar(Servicios s);
	
	Set<Servicios> listarTodos();
	
	Set<Medicos> medicosDelServicio(Servicios s);
	
	Medicos jefeServicio(Servicios s);
	
	void insertarEspecialidad(Especialidades e);	
	
	boolean eliminar(Especialidades e);
	
	void modificar(Especialidades e);
	
	Set<Especialidades> listarTodas();
	
	Set<Medicos> medicosPorEspecialidad(Especialidades e);
	
}
