package com.cursojava.introduccion.teoria.enumerados;

public enum Mes {

	ENERO("ene", 31), FEBRERO("feb", 28), MARZO("mar", 31), ABRIL("abr", 30), MAYO("may", 31), JUNIO("jun", 30);
	
	private String abrev;
	private int dias;
	
	private Mes(String abrev, int dias) {
		this.abrev = abrev;
		this.dias = dias;
	}

	public String getAbrev() {
		return abrev;
	}

	public int getDias() {
		return dias;
	}

}
