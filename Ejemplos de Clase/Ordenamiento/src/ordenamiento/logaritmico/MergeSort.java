package ordenamiento.logaritmico;

public class MergeSort {

	//Método 1: Rutina Guía
	public static void mergeSort(int[] arreglo) {
		
		//Este método lo unico que hace es llamar al metodo 
		//de 3 argumentos, mergeSort() el cual contiene la lógica
		
		//El primer elemento del arreglo es el 0
		//El ultimo elemento del arreglo es N-1, ya que el conteo arranca en 0
		System.out.println("MERGE SORT:");
		imprimir(arreglo);
		System.out.println();
		MergeSort.mergeSort(arreglo, 0, arreglo.length-1);
		
	}
	
	//Método 2: Algoritmo de Merge Sort
	private static void mergeSort(int[] arreglo, int primero, int ultimo) {
		
		//Contendrá el índice correspondiente a la mitad del arreglo
		int centro;
		
		//Si primero es mayor a ultimo, no se puede calcular el medio
		//Si primero es igual a ultimo, arreglo de un elemento ya está ordenado, 
		//salgo de recursividad, se logra al no entrar en el if. 
		
		//Si primero es menor que ultimo, puedo calcular el centro
		//por lo que puedo dividir el arreglo en dos partes
		if(primero<ultimo) {
			
			//Es MAS, no MENOS
			centro = (primero+ultimo)/2;
			System.out.println("Primero = " + primero + " Centro = " + centro + " Ultimo = " + ultimo);
			
			//Ordeno la parte izquierda
			System.out.println("Izquierda");
			mergeSort(arreglo, primero, centro);
			
			System.out.println("Derecha");
			//Ordeno la parte derecha
			mergeSort(arreglo, centro+1, ultimo);
			//Mezclo los dos arreglos ordenados
			mezclar(arreglo, primero, centro, ultimo);
			
			imprimir(arreglo);
			System.out.println();
			
		}
		
		//Si sale del if, simplemente retorna
		//Si es parte de una recursividad, regresa al punto de llamada
		//Si no, termina.
		
	}
	
	
	//Método 3: Algoritmo de Mezcla
	private static void mezclar(int[] arreglo, int izquierda, int centro, int derecha) {
		
		//Tamaños de cada arreglo
		//Podría pasar que izquierda !=0, por eso se hace la diferencia
		//Si fuera 0, entonces el tamaño del arreglo (length) es igual a centro+1
		int nIzq = centro - izquierda +1;
		//Creo un arreglo temporal para el lado izquierdo
		int izq[] = new int[nIzq];
		
		//Si tengo un arreglo de 8 elementos, ultimo va a ser 7.
		//El centro sería 3 (redondea hacia abajo), y 7-3 = 4. 
		//Tendria capacidad de almacenar solo 4 elementos el de la derecha
		//recordar que el lado derecho arranca desde centro+1
		int nDer = derecha-centro;
		//Creo un arreglo temporal para el lado derecho
		int der[] = new int[nDer];
		
		//Copio los elementos de arreglo en los temporales
		
		//Copio lado Izquierdo:
		for(int i=0; i<nIzq; i++) {
			//Recordar que izquierda puede ser !=0
			izq[i]=arreglo[izquierda+i];
		}
		
		//Copio lado Derecho
		for(int i=0; i<nDer; i++) {
			
			//Desde el centro+1 del arreglo
			der[i]=arreglo[centro+1+i];
			
		}
		
		
		//---------------MEZCLA-------------------
		
		//Indices para mezclar los arreglos. 
		int i=0, j=0;
		
		//Este es para controlar en el arreglo principal.
		//Se copiaran los arreglos auxiliares en arreglo.
		int k=izquierda;
		
		
		while(i<nIzq && j<nDer) {
			
			//Compara los primeros elementos de cada arreglo
			//y consulta cuál es el menor. 
			
			//Si el de la izquierda es menor que el de la derecha
			//continúo moviendome en la parte izquierda hasta que 
			//el de la derecha sea el proximo menor
			if(izq[i]<=der[j]) {
				
				arreglo[k] = izq[i];
				//Me muevo en izquierda
				i++;
			}
			else {
				//El de la derecha es menor, por lo que continúo 
				//moviendome en la derecha
				
				arreglo[k] = der[j];
				//Me muevo en derecha
				j++;
				
			}
			//Muevo una posición el arreglo para insertar el siguiente 
			//elemento
			k++;
			
		}
		
		//Es probable que queden elementos en uno de los arreglos auxiliares
		//Ocurre cuando por ejemplo, el de la izquierda tiene todos los valores
		//más pequeños que el primero de la derecha. El de la derecha nunca
		//se copiaría con el while de arriba. O cuando un arreglo es menor que otro
		
		//Si queda en la izquierda, los copio a todos
		while(i<nIzq) {
			
			arreglo[k]=izq[i];
			i++;
			k++;
			
		}
		
		//Si queda en la derecha, los copio a todos
		while(j<nDer) {
			arreglo[k]=der[j];
			j++;
			k++;
		}
		
		
	}
	
	
	private static void imprimir(int a[]) {
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(a[i] + "-");
		
		}
	}
}
