package ordenamiento.lineal;

import java.util.ArrayList;
import java.util.List;

public class RadixSort {

	public static void radixSort(int arreglo[]) {
		
		System.out.println("RADIX SORT:");
		imprimir(arreglo);
		System.out.println();

		//Creo la lista principal que almacenar� todas las urnas
		//El cada digito de un numero va desde 0 a 9. 
		List[] urna = new ArrayList[10];
		
		//Inicializo la urna con listas de tama�o arreglo.length 
		//lo peor pasaria si todos los elementos tienen el mismo valor
		//de urna
		for(int i=0; i<urna.length; i++) {
			
			urna[i] = new ArrayList<Integer>(arreglo.length);
		}
	
		//Obtengo la cantidad m�xima de cifras del arreglo.
		int cifra = cantidadDigitos(arreglo);
		
		//Indica en base a qu� digito est� ordenando el arreglo
		int digito=0;
		
		//Criterio que ir� cambiando iteraci�n a iteraci�n
		//Indica si est� en las centenas, decenas, unidades. Arranca en
		//las unidades
		int cifraSignificativa = 1;
		
		//Para aplanar la lista, mantiene el �ltimo �ndice ordenado
		int indiceArregloOrdenado=0;
		
		//Va a iterar tantas veces como cifra tenga. Si el n�mero 
		//m�ximo tiene 5 cifras, va a realizar 5 iteraciones
		for(int i=0; i<cifra; i++) {
			
			//A cada elemento del arreglo lo asigno a una urna
			for(int j=0; j<arreglo.length; j++) {
				
				//Cifra significativa indica si estoy en las unidades,
				//decenas, centenas, etc. 
				//El digito correspondiente, por ejemplo, a las decenas
				//del n�mero 23490, va a ser: 23490/10 = 2349
				//2349%10 = 9
				digito = (arreglo[j]/cifraSignificativa)%10;
				
				//Asigno a la urna correspondiente a d�gito el elemento
				urna[digito].add(arreglo[j]);
						
			}
			
			//Termin� de ubicar todos los elementos en las urnas
			
			//Aplano la lista de urnas. Asigno cada elemento de urna
			//al arreglo
			//En total, hay 10 urnas (recordar que son 10 digitos)
			
			//Indice ordenado es a partir de donde debe continuar
			//la siguiente urna insertando en el arreglo, por eso est� 
			//fuera del for
			indiceArregloOrdenado = 0;
			
			for(int h = 0; h<10; h++) {
				
				//Reviso primero la urna h. 
				for(int j=0; j<urna[h].size(); j++) {
					
					//Asigno a arreglo los elementos de la urna h
					arreglo[indiceArregloOrdenado] = (int)urna[h].get(j);
					indiceArregloOrdenado++;
					
				}
				
				//Termino con la urna, debo vaciar la urna h para la 
				//pr�xima ronda total. 
				urna[h].clear();
				
			}
			
			System.out.print("Cifra Significativa = " + cifraSignificativa + " ");
			imprimir(arreglo);
			System.out.println();
			//Paso a la siguiente cifra (decenas, centenas, etc)
			cifraSignificativa*=10;
			
			
		}
		
	}
		
	//Obtiene la cantidad de d�gitos m�xima que tiene el arreglo.
	//Es decir, si todos los elementos son de 2 cifras o 5.
	public static int cantidadDigitos(int[] arreglo){

		//El elemento m�ximo del arreglo determina la cantidad m�xima de cifras
		int maximo = maximo(arreglo);
		int cantidad=0;

		while(maximo>0){

			cantidad++;
			maximo/=10;

		}

		return cantidad;
	}
	
	//Obtiene el valor m�ximo del arreglo.
	private static int maximo(int[] arreglo) {
		
		int max=-1;
		
		for(int i=0; i<arreglo.length; i++) {
			
			if(arreglo[i]>max) {
				max=arreglo[i];
			}
		}
		
		return max;
	}
	
	private static void imprimir(int a[]) {
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(a[i] + "-");
		
		}
		System.out.println();
	}
	
	
}
