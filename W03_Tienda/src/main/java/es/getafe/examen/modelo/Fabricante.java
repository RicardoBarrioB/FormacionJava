package es.getafe.examen.modelo;

import java.io.Serializable;
import java.util.List;
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
@Table(name = "fabricantes")
public class Fabricante implements Serializable, Comparable<Fabricante> {

	private int idFabricante;
	
	private String fabricante;
	
	private Set<Producto> productos;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_fabricante")
	public int getIdFabricante() {
		return idFabricante;
	}

	public void setIdFabricante(int idFabricante) {
		this.idFabricante = idFabricante;
	}
	
	@Column(name = "fabricante")
	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	@OneToMany(mappedBy = "fabricante")	
	public Set<Producto> getProductos() {
		return productos;
	}

	public void setProductos(Set<Producto> productos) {
		this.productos = productos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idFabricante);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fabricante other = (Fabricante) obj;
		return idFabricante == other.idFabricante;
	}


	@Override
	public int compareTo(Fabricante f) {
		if(this.equals(f)) return 0;
		return this.idFabricante - f.idFabricante;
	}

}
