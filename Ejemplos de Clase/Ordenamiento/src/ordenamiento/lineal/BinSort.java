package ordenamiento.lineal;

import java.util.ArrayList;
import java.util.List;

public class BinSort {
	
	//Con ARREGLO AUXILIAR:
	//TODO Agregar un método que genere una clave por cada valor
	public static void binSortConArregloAux(int[] arreglo, int max) {
		
		System.out.println("BIN SORT: Arreglo Auxiliar");
		
		//max indica el máximo valor que tendrá el arreglo, el cual indica 
		//el tamaño máximo que almacenará. 
		int aux[]=new int[max+1];
		
		for(int i=0; i<arreglo.length; i++) {
			
			aux[arreglo[i]]=arreglo[i];
			imprimir(aux);
		}
		
		imprimir(aux);
		
		//arreglo = acomodar(aux);
		arreglo = aux;
		
	}
	
	//Sin ARREGLO AUXILIAR:
	//TODO Agregar un método que genere una clave por cada valor
	//No funciona si no viene un cero en el arreglo
	public static void binSortSinArregloAux(int[] arreglo) {
		
		int aux;
		
		System.out.println("BIN SORT: Sin Arreglo Auxiliar");
		
		for(int i=1; i<arreglo.length; i++) {
			
			//Mientras no esté en la posición i, su clave
			while(arreglo[i]!=i) {
				
				//Intercambio
				
				//Cuidado con poner arreglo[arreglo[i]], se hace un bucle
				//por obvias razones.
				aux=arreglo[i];
				arreglo[i] = arreglo[aux];
				arreglo[aux]=aux;
				System.out.println("arreglo[i] " + arreglo[i]);
			}
			
			//Cuando i se encuentre donde corresponda, pasa al siguiente i
			imprimir(arreglo);
			System.out.println();
		}
	}
	
	
	//Con elementos repetidos:
	public static void binSortRepetidos(int[] arreglo, int max) {
		
		System.out.println("BIN SORT: Repetidos");
		imprimir(arreglo);
		System.out.println();
		//Creo la lista principal que almacenará todas las urnas
		List[] urna = new ArrayList[max+1];
		
		for(int k=0; k<=max;k++) {
			//A cada urna le asigno un arreglo
			urna[k] = new ArrayList<Integer>(arreglo.length);
			
		}
		
		//Coloco donde corresponda los elementos del arreglo en cada urna
		for(int i=0; i<arreglo.length; i++) {
			//Obtengo la urna correspondiente, es decir, 
			//su lista, y añado el elemento del arreglo
			urna[arreglo[i]].add(arreglo[i]); 
	
		}
		
		
		//Concatena listas en una sola.
		int pos=0;
		for(int i=0; i<=max; i++) {
			for(int j=0; j<urna[i].size(); j++) {
				
				arreglo[pos]=(int)urna[i].get(j);
				pos++;
				
			}
			System.out.println("urna.size: " + urna[i].size());
			imprimir(arreglo);
		}
		
		imprimir(arreglo);
		
	}
	
	
	
	
	
	
	
	
	
	
	private static void imprimir(int a[]) {
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(a[i] + "-");
		
		}
		System.out.println();
	}
}
