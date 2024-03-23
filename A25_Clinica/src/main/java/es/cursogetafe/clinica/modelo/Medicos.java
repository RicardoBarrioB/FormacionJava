package es.cursogetafe.clinica.modelo;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "medicos")
public class Medicos implements Serializable {

	private int idMedico;
	
	private String nombre;
	
	private String apellidos;
	
	private Servicios servicio;
	
	private Especialidades especialidad;
	
	private Set<Servicios> director;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idMedico")
	public int getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(int idMedico) {
		this.idMedico = idMedico;
	}

	@Column(name = "nombre")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "apellidos")
	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@ManyToOne
	@JoinColumn(name = "fk_servicio")
	public Servicios getServicio() {
		return servicio;
	}

	public void setServicio(Servicios servicio) {
		this.servicio = servicio;
	}

	@ManyToOne
	@JoinColumn(name = "fk_especialidad")
	public Especialidades getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidades especialidad) {
		this.especialidad = especialidad;
	}
	
	@OneToMany(mappedBy = "jefeServicio")
	public Set<Servicios> getDirector() {
		return director;
	}

	public void setDirector(Set<Servicios> director) {
		this.director = director;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idMedico);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medicos other = (Medicos) obj;
		return idMedico == other.idMedico;
	}

	@Override
	public String toString() {
		return "Medicos [idMedico=" + idMedico + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}
	
}
