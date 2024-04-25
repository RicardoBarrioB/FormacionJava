package es.getafe.tienda.persistencia;

import java.util.Optional;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import es.getafe.tienda.modelo.Fabricante;

public interface FabricanteDao extends JpaRepository<Fabricante, Integer>{
	
	@Query("select f from Fabricante f left join fetch f.productos where f.idFabricante = ?1")
	public Optional<Fabricante> findByIdEager(int idFabricante);
	
	@Query("select f from Fabricante f join f.productos")
	public Set<Fabricante> findOnlyActive();
	
}
