package ejercicios06;

import java.util.Arrays;
import java.util.Random;

public class MetodosOrdenacion {
	public static void main(String[] args) {
		int[] array = {7,2,4,3,9,8,5};
	//	burbuja(array);
	//	printArray(array);
		
	/*	int[] v1 = crearArray();
		int [] v2 = v1.clone();
		long t0, tf;
		
		t0 = System.currentTimeMillis();
		Arrays.sort(v1);
		tf = System.currentTimeMillis();
		System.out.println("QuickSort: " + (tf-t0) + "ms.");
		
		t0 = System.currentTimeMillis();
		burbuja(v2);
		tf = System.currentTimeMillis();
		System.out.println("Burbuja: " + (tf-t0) + "ms.");*/
		
		qsort(array, 0, array.length-1);
		printArray(array);
	}
	
	public static int [] crearArray() {
		int cant = 1_000_000;
		int[] v = new int[cant];
		Random r = new Random();
		for (int i = 0; i < v.length; i++) {
			v[i] = r.nextInt();
		}
		return v;
	}
	
	public static void burbuja(int... array){
		int count = 1;
		
		for(int i = array.length-1; i > 0 && count != 0; i--) {
			count = 0;
			for(int j = 0; j < i; j++) {
				if(array[j] > array[j+1]) {
					array[j] = array[j] + array[j+1];
					array[j+1] = array[j] - array[j+1];
					array[j] = array[j] - array[j+1];
					count++;
				}
			}
		}
	}	
	
	public static void printArray (int... array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+",");
		}
	}
	
	public static void qsort(int[] v, int izq, int der) {
		int pivote = izq;
		int i = izq;
		int d = der;
		int aux;
		while(i < d) {
			while(v[i] <= v[pivote] && i < d) i++;
			while(v[d] > v[pivote]) d--;
			if(i < d) {
				aux = v[i];
				v[i] = v[d];
				v[d] = aux;
			}
		}
		aux = v[pivote];
		v[pivote] = v[d];
		v[d] = aux;
		pivote = d;
		if(izq < pivote-1)
			qsort(v, izq, pivote-1);
		if(pivote+1 < der)
			qsort(v, pivote+1, der);
	}
}






