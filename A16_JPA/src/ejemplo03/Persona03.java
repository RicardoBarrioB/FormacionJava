package ejemplo03;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ejemplo02.Genero;

@Entity
@Table(name = "persona_04")
public class Persona03 implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPersona")
	private int idPersona;

	@Column(name = "apellidos")
	private String apellidos;
	
	@Column(name = "apodo")
	private String apodo;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "dni")
	private String dni;
	
	@Column(name = "genero")
	@Enumerated(EnumType.STRING)
	private Genero genero;
	
	@Embedded
	@AttributeOverride(name = "tipoVia", column = @Column(name="tipo_via"))
	@AttributeOverride(name = "codigoPostal", column = @Column(name="codigo_postal"))
	private Domicilio dom;
	
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getApodo() {
		return apodo;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public Domicilio getDom() {
		return dom;
	}
	public void setDom(Domicilio dom) {
		this.dom = dom;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idPersona);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona03 other = (Persona03) obj;
		return idPersona == other.idPersona;
	}
	
	@Override
	public String toString() {
		return "Persona01 [" + idPersona + ", " + apellidos + ", " + apodo + ", " + nombre + ", " + dni + ", " + dom + "]";
	}
}
