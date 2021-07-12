package guia09.problema02;

public class VersionLineal {
	
	public static int falta(int[] a) {
		
		int falta=0;
		int suma=0;
		int ecuacion=0;
		int operaciones=0;
		for(int i=0; i<a.length; i++) {
			
			operaciones++;
			suma+=a[i];
			
		}
		
		//N*(N+1)/2 desde el 1 hasta N
		ecuacion = a.length*(a.length+1)/2;
		falta = ecuacion-suma;
		
		System.out.println("Cantidad de Operaciones: " + operaciones);
		return falta;
		
	}
}
