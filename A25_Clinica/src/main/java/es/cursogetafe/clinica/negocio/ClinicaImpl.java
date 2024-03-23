package es.cursogetafe.clinica.negocio;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.cursogetafe.clinica.modelo.Especialidades;
import es.cursogetafe.clinica.modelo.Medicos;
import es.cursogetafe.clinica.modelo.Servicios;
import es.cursogetafe.clinica.persistencia.EspecialidadesDao;
import es.cursogetafe.clinica.persistencia.MedicosDao;
import es.cursogetafe.clinica.persistencia.ServiciosDao;

@Service
public class ClinicaImpl implements Clinica {
	
	@Autowired
	private MedicosDao medDao;
	
	@Autowired
	private ServiciosDao serDao;
	
	@Autowired
	private EspecialidadesDao espDao;
	
	@Override
	public void insertarContacto(Medicos m) {
		medDao.insertarMedico(m);
	}

	@Override
	public Class<?> eliminar(int id, Class<?> clase) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminar(Medicos m) {
		return medDao.eliminar(m);
	}

	@Override
	public void modificar(Medicos m) {
		medDao.modificar(m);
	}

	@Override
	public Set<Medicos> buscarTodos() {
		return medDao.buscarTodos();
	}

	@Override
	public Set<Medicos> buscarMedicos(String cadena) {
		return medDao.buscarMedicos(cadena);
	}

	@Override
	public Class<?> buscar(int id, Class<?> clase) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertarServicio(Servicios s) {
		serDao.insertarServicio(s);		
	}

	@Override
	public boolean eliminar(Servicios s) {
		return serDao.eliminar(s);
	}

	@Override
	public void modificar(Servicios s) {
		serDao.modificar(s);		
	}

	@Override
	public Set<Servicios> listarTodos() {
		return serDao.listarTodos();
	}

	@Override
	public Set<Medicos> medicosDelServicio(Servicios s) {
		return serDao.medicosDelServicio(s);
	}

	@Override
	public Medicos jefeServicio(Servicios s) {
		return serDao.jefeServicio(s);
	}

	@Override
	public void insertarEspecialidad(Especialidades e) {
		espDao.insertarEspecialidad(e);		
	}

	@Override
	public boolean eliminar(Especialidades e) {
		return espDao.eliminar(e);
	}

	@Override
	public void modificar(Especialidades e) {
		espDao.modificar(e);
	}

	@Override
	public Set<Especialidades> listarTodas() {
		return espDao.listarTodas();
	}

	@Override
	public Set<Medicos> medicosPorEspecialidad(Especialidades e) {
		return espDao.medicosPorEspecialidad(e);
	}
}
