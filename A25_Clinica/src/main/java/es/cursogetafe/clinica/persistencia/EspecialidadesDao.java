package es.cursogetafe.clinica.persistencia;

import java.util.Set;

import es.cursogetafe.clinica.modelo.Especialidades;
import es.cursogetafe.clinica.modelo.Medicos;

public interface EspecialidadesDao {

	void insertarEspecialidad(Especialidades e);	
	
	Especialidades eliminar(int idEspecialidad);
	
	boolean eliminar(Especialidades e);
	
	void modificar(Especialidades e);
	
	Set<Especialidades> listarTodas();
	
	Set<Medicos> medicosPorEspecialidad(Especialidades e);
	
	Especialidades buscar(int idEspecialidad);
}
