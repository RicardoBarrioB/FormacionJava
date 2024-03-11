package com.cursojava.introduccion.teoria;

public class T06AlcanceVariables {
	static int clase = 0;
	public static void main(String[] args) {
		int metodo = 0;
		
		System.out.println(clase);
		System.out.println(metodo);

	{
	int cuerpo = 0;
	System.out.println(clase);
	System.out.println(metodo);
	System.out.println(cuerpo);
	
	}
	
// 	System.out.println(cuerpo); La variable cuerpo está declarada en la sentencia compuesta anterior.

	
	while(metodo==0) {
		
		int enWhile =0;
		
		
		System.out.println(clase);
		System.out.println(metodo);
//		System.out.println(cuerpo); No se puede acceder a la variable cuerpo
		System.out.println(enWhile);		
	}
	
	
	System.out.println(clase);
	System.out.println(metodo);
//	System.out.println(cuerpo); No se puede acceder a la variable cuerpo
//	System.out.println(enWhile); No se puede acceder a la variable enWhile
	
	
	}
}