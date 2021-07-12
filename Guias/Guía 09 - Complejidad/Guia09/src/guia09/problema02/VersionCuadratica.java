package guia09.problema02;

//Un arreglo A contiene n-1 enteros únicos en el intervalo [0, n-1]; esto es hay un número de
//este intervalo que no está en A.

//Escribir en java, dos soluciones, una en la clase Solucion1, y otra en la clase Solucion2 para este
//problema, una con complejidad O(n) y otra con complejidad mayor ( por ejemplo O(n 2 )).
//Ejecutar pruebas y realizar un análisis empírico

public class VersionCuadratica {
	
	public static int falta(int[] a) {
		
		int falta;
		
		int operaciones=0;
		for(int i=0; i<a.length; i++) {
			
			operaciones++;
			
			int j=0;
			boolean encontrado=false;
			
			while(j<a.length && !encontrado) {
				
				operaciones++;
				//Si lo encuentro, salgo del while
				if(a[j]==i) {
				
					encontrado=true;
				
				}
				
				j++;
				
			}
			
			if(!encontrado) {
				
				System.out.println("Cantidad de Operaciones: " + operaciones);
				return i;
			
			}
			
		}
		
		System.out.println("Cantidad de Operaciones: " + operaciones);
		return -2;
	}
	
}
