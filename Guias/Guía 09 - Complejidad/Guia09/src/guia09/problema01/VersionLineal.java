package guia09.problema01;


//Suponga que cada renglón de un arreglo A de NxN posee valores 1 y 0 de tal modo que en
//cualquier renglón de A todos los 1 van antes de que los 0.
//Escriba un método que permita determinar el renglón de A que contiene la mayor cantidad de
//unos.
//Escribir en java, dos soluciones, una en la clase Solucion1, y otra en la clase Solucion2 para este
//problema, una con complejidad O(n) y otra con complejidad mayor ( por ejemplo O(n 2 )).
//Ejecutar pruebas y realizar un análisis empírico para verificar que los tiempos de ejecución
//crecen según la complejidad estimada


public class VersionLineal {

	public static int renglon(int[][] a) {
		
		//Cantidad de operaciones
		int operaciones=0;
		
		//Representa el índice de columna donde finaliza el 1 y comienza el 0. Es decir, el máximo valor de 1 que hay
		int max = 0;
		//Indica qué fila tiene la mayor cantidad de 1.
		int fila=0;
		
		//Tengo que recorrer todas las filas
		for(int i=0; i<a.length; i++) {
			
			//Si la matriz tiene un valor distinto de 0, puede que a la derecha tenga un 1 y tenga mayor índice
			//que la fila anterior
			
			operaciones++;
			
			//No requiero recorrer desde el comienzo, sino que solo recorro desde el máximo anterior hacia adelante
			if(a[i][max] != 0) {
				
				int j = max;
				while(j<a.length && a[i][j]!=0) {
					
					j++;
					operaciones++;
				}
				
				//Si es igual, lo ignoro. Pero si es mayor, actualizo la fila correspondiente
				if(j>max) {
					
					fila = i;
					max = j;
					operaciones++;
				}
			}
		}
		
		System.out.println("Cantidad de Operaciones: " + operaciones);
		return fila;
	}
	
}
