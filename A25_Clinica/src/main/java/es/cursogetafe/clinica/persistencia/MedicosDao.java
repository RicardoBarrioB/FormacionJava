package es.cursogetafe.clinica.persistencia;

import java.util.Set;
import es.cursogetafe.clinica.modelo.Medicos;

public interface MedicosDao {

	void insertarMedico(Medicos m);	
	
	Medicos eliminar(int idMedico);
	
	boolean eliminar(Medicos m);
	
	void modificar(Medicos m);
	
	Set<Medicos> buscarTodos();
	
	Set<Medicos> buscarMedicos(String cadena);
	
	Medicos buscar(int idMedico);
}
