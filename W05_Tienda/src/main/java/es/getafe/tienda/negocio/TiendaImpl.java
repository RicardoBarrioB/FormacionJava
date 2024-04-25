package es.getafe.tienda.negocio;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.getafe.tienda.modelo.Fabricante;
import es.getafe.tienda.modelo.Producto;
import es.getafe.tienda.persistencia.FabricanteDao;
import es.getafe.tienda.persistencia.ProductoDao;
import jakarta.annotation.PostConstruct;

@Service
public class TiendaImpl implements Tienda{
	
	@Autowired
	private ProductoDao prod;
	
	@Autowired
	private FabricanteDao fab;
	
	@PostConstruct
	public void prueba() {
		prod.findByDescripcion("disco").stream().map(x -> x.getProducto()).forEach(System.out::println);
	}
	
	@Override
	public Set<Producto> getProductos() {
		
		Set<Producto> productos = new TreeSet<Producto>(new Comparator<Producto>() {
			@Override
			public int compare(Producto p1, Producto p2) {
				Collator col = Collator.getInstance(new Locale("es"));
				return col.compare(p1.getProducto(),p2.getProducto());
			}
		});
		
		productos.addAll(prod.findAll());
		
		return productos;
	}

	@Override
	public Set<Producto> getProductos(String descripcion) {

		Set<Producto> productos = new TreeSet<>(prod.findByDescripcion(descripcion));
		
		if(productos.size() == 0)
			return null;

		return productos;
	}

	@Override
	public double getMediaPrecioProductosByFabricante(int idFabricante) {
		
		Optional<Fabricante> fOpt = fab.findByIdEager(idFabricante);
		if(fOpt.isEmpty())
			return 0;		
		
		Fabricante fabricante = fOpt.get();
		double suma = 0;
		
		for (Producto producto : fabricante.getProductos()) {
			suma += producto.getPrecio();
		}

		return suma/fabricante.getProductos().size();
	}

	@Override
	public void addFabricante(Fabricante fabricante) {
		fab.save(fabricante);		
	}

	@Override
	public void addProducto(Producto producto) {
		prod.save(producto);
		
	}

	@Override
	public Set<Fabricante> getFabricantes() {
		Set<Fabricante> fabricantes = new TreeSet<Fabricante>(new Comparator<Fabricante>() {
			@Override
			public int compare(Fabricante f1, Fabricante f2) {
				return (f1.getFabricante()).compareTo(f2.getFabricante());
			}
		});
		
		fabricantes.addAll(fab.findAll());
		
		return fabricantes;
	}

	@Override
	public Set<Fabricante> getFabricantesActivos() {
		Set<Fabricante> fabricantes = new TreeSet<Fabricante>(new Comparator<Fabricante>() {
			@Override
			public int compare(Fabricante f1, Fabricante f2) {
				return (f1.getFabricante()).compareTo(f2.getFabricante());
			}
		});
		
		fabricantes.addAll(fab.findOnlyActive());
		
		return fabricantes;
	}

	@Override
	public Fabricante getFabricante(int idFabricante) {
		Optional <Fabricante> resu = fab.findById(idFabricante);
		return resu.isPresent() ? resu.get() : null;
	}

	@Override
	public Fabricante getFabricanteConProductos(int idFabricante) {
		Optional <Fabricante> resu = fab.findByIdEager(idFabricante);
		return resu.isPresent() ? resu.get() : null;
	}


}
