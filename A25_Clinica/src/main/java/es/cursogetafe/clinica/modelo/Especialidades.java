package es.cursogetafe.clinica.modelo;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "especialidades")
public class Especialidades implements Serializable {

	private int idEspecialidad;
	
	private String nombre;
	
	private Set<Medicos> medicos;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idEspecialidad")
	public int getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(int idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	@Column(name = "nombre")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@OneToMany(mappedBy = "especialidad")
	public Set<Medicos> getMedicos() {
		return medicos;
	}

	public void setMedicos(Set<Medicos> medicos) {
		this.medicos = medicos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idEspecialidad);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Especialidades other = (Especialidades) obj;
		return idEspecialidad == other.idEspecialidad;
	}

	@Override
	public String toString() {
		return "Especialidades [idEspecialidad=" + idEspecialidad + ", nombre=" + nombre + "]";
	}
	
}
