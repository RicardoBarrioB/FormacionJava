package es.getafe.tienda.persistencia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import es.getafe.tienda.modelo.Producto;

public interface ProductoDao extends JpaRepository<Producto, Integer>{
	
	@Query("select p from Producto p where p.producto like %?1%")
	public List<Producto> findByDescripcion(String descripcion);
	
}
