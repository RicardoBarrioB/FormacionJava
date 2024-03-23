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
import javax.persistence.Table;

@Entity
@Table(name = "servicios")
public class Servicios implements Serializable {

	private int idServicio;
	
	private String nombreServicio;
	
	private Medicos jefeServicio;
	
	private Set<Medicos> medicosServicio;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idServicio")
	public int getIdServicio() {
		return idServicio;
	}

	public void setIdServicio(int idServicio) {
		this.idServicio = idServicio;
	}
	
	@Column(name = "nombre_servicio")
	public String getNombreServicio() {
		return nombreServicio;
	}

	public void setNombreServicio(String nombreServicio) {
		this.nombreServicio = nombreServicio;
	}

	@ManyToOne
	@JoinColumn(name = "fk_jefe_servicio")
	public Medicos getJefeServicio() {
		return jefeServicio;
	}

	public void setJefeServicio(Medicos jefeServicio) {
		this.jefeServicio = jefeServicio;
	}

	@OneToMany(mappedBy = "servicio")
	public Set<Medicos> getMedicosServicio() {
		return medicosServicio;
	}

	public void setMedicosServicio(Set<Medicos> medicosServicio) {
		this.medicosServicio = medicosServicio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idServicio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Servicios other = (Servicios) obj;
		return idServicio == other.idServicio;
	}

	@Override
	public String toString() {
		return "Servicios [idServicio=" + idServicio + ", nombreServicio=" + nombreServicio + "]";
	}
	
}
