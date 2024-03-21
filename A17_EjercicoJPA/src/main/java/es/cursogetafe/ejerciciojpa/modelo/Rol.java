package es.cursogetafe.ejerciciojpa.modelo;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "roles")
@Inheritance(strategy = InheritanceType.JOINED)
public class Rol implements Serializable {
	
	private int idRol;
	
	private String rol;
	private Persona persona;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdRol() {
		return idRol;
	}

	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}

//	@Column(name = "rol")
	public String getRol() {
		return rol;
	}

	protected void setRol(String rol) {
		this.rol = rol;
	}

	@ManyToOne
	@JoinColumn(name = "idPersona")
	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Transient
	public int getIdPersona() {
		return persona.getIdPersona();
	}

	@Transient
	public String getApellidos() {
		return persona.getApellidos();
	}

	@Transient
	public List<Rol> getRoles() {
		return persona.getRoles();
	}
}
