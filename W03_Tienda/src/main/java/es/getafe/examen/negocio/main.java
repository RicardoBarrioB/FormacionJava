package es.getafe.examen.negocio;

import java.util.HashSet;
import java.util.Set;

import es.getafe.examen.modelo.Fabricante;
import es.getafe.examen.persistencia.FabricanteDao;
import es.getafe.examen.persistencia.FabricanteDaoImpl;

public class main {

	public static void main(String[] args) {
		FabricanteDao fab = new FabricanteDaoImpl();
		
		Set<Fabricante> f = new HashSet(fab.findOnlyActive());
		
	}

}
