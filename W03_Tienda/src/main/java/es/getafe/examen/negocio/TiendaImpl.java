package es.getafe.examen.negocio;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

import es.getafe.examen.modelo.Fabricante;
import es.getafe.examen.modelo.Producto;
import es.getafe.examen.persistencia.FabricanteDao;
import es.getafe.examen.persistencia.FabricanteDaoImpl;
import es.getafe.examen.persistencia.ProductoDao;
import es.getafe.examen.persistencia.ProductoDaoImpl;

public class TiendaImpl implements Tienda{
	
	private ProductoDao prod = new ProductoDaoImpl();
	private FabricanteDao fab = new FabricanteDaoImpl();

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
		
		Fabricante fabricante = fab.findById(idFabricante);
		double media = 0;
		
		if(fabricante != null) {
			for (Producto producto : fabricante.getProductos()) {
				media += producto.getPrecio();
			}
			media = media/fabricante.getProductos().size();
		}
		
		return media;
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
		return fab.findByIdLazy(idFabricante);
	}

	@Override
	public Fabricante getFabricanteConProductos(int idFabricante) {
		return fab.findById(idFabricante);
	}


}
