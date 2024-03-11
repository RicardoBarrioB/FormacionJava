package com.cursojava.introduccion.teoria;

public class T01CompatibilidadTipos {
	public static void main(String[] arg) {
		byte b = 10;
		short s = b;
		int i = s;
		long l = i;
		
		float f = i;
		double d = f;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);		
		
		i = Integer.MAX_VALUE;
		System.out.println(i);
		l = i;
		f = i;
		d = i;
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		
		l = Long.MAX_VALUE;
		f = l;
		d = l;
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);	
				
	}
}
