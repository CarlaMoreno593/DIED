package guia10.problema03;

public class Rotaciones {

	public static void main(String[] args) {

		int[] a = {3,5,7,9,10,11};
		int[] b = {11,3,5,7,9,10};
		int[] c = {10,11,3,5,7,9};
		int[] d = {9,10,11,3,5,7};
		int[] e = {7,9,10,11,3,5};
		int[] f = {5,7,9,10,11,3};
		
		int[] g = {3,4,5,7,9,10,11};
		
		System.out.println("Rotaciones: " + rotaciones(a));
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Rotaciones: " + rotaciones(b));
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Rotaciones: " + rotaciones(c));
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Rotaciones: " + rotaciones(d));
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Rotaciones: " + rotaciones(e));
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Rotaciones: " + rotaciones(f));
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Rotaciones: " + rotaciones(g));
	}
	
	//El arreglo viene ordenado
	public static int rotaciones(int[] a) {
		
		return rotaciones(a, 0, a.length-1);
		
	}
	
	//Rotación es (i+1)%a.length, con i=indice donde está el mayor desacomodado
	public static int rotaciones(int[] a, int inicio, int fin ) {
		
		int centro = (inicio+fin)/2;
		imprimir(a,inicio, fin);
		System.out.println("Centro: " + centro);
		
		if(inicio==fin) {
			System.out.println("Inicio==Fin : " +  inicio);
			return 0;
		}
		
		//Quedan dos elementos
		if(inicio==centro) {
			if(a[inicio]>a[centro+1]) {
				
				System.out.println("Entro a [10,3]");
				return (centro+1);
				
			}
			else {
				System.out.println("Entro a [9,10]");
				return 0;
			}
		}
		else {
			
			//[...., 10, 3, 5,.....]
			if(a[centro-1]>a[centro] && a[centro]<a[centro+1]) {
				
				System.out.println("Entro a [10, 3, 5]");
				return centro;
				
			}
			else {
				//[...., 9, 10, 3 .....]
				if(a[centro-1]<a[centro] && a[centro]>a[centro+1]) {
					System.out.println("Entro a [9,10,3]");
					return (centro+1);
					
				}
				else {
					
					System.out.println("Entro a [3,5,7]");
					int izquierda = rotaciones(a, inicio, centro-1);
					if(izquierda!=0) {
						
						return izquierda;
						
					}
					
					return rotaciones(a, centro+1, fin);
					
				}
			}
			
		}
		
		
	}

	public static void imprimir(int a[], int inicio, int fin) {
		
		for(int i=inicio; i<=fin; i++) {
			System.out.print(a[i] + "-");
		}
		System.out.println();
	}
}
