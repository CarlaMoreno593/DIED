package ordenamiento.logaritmico;

public class QuickSort {

	//Rutina Gu�a
	public static void quickSort(int[] arreglo) {
		
		//Llama al m�todo recursivo de quickSort con los tres 
		//par�metros correspondientes
		System.out.println("QUICK SORT:");
		imprimir(arreglo);
		System.out.println();
		quickSort(arreglo, 0, arreglo.length-1);
		
	}
	
	//Algoritmo de QuickSort
	public static void quickSort(int[] arreglo, int primero, int ultimo) {
		
		int aux;
		
		int i = primero;
		int j = ultimo;
		

		//Almacena el �ndice del elemento central.
		int centro = (primero+ultimo)/2;
		int pivote = arreglo[centro];
		
		System.out.println("Primero = " + primero + " Central = " + centro + " �ltimo = " + ultimo);
		imprimir(arreglo);
		System.out.println();
		
		do {
			
			//Hasta que encuentre un elemento menor al pivote
			//el lado izquierdo est� "ordenado"
			//Me muevo de izq. a der.
			while(arreglo[i]<pivote) {
				i++;
			}
			
			//Mientras que encuentre un elemento mayor al pivote
			//el lado derecho est� ordenado. 
			//Me muevo de der. a izq.
			while(arreglo[j]>pivote) {
				j--;
			}
			
			//Llego al punto donde tengo dos posibles situaciones
			//Si i<=j, quiere decir que hay un elemento a la derecha
			//y un elemento a la izquierda del pivote que est� desordenado 
			if(i<=j) {
				//Intercambio sus lugares para acomodarlos
				aux = arreglo[i];
				arreglo[i]=arreglo[j];
				arreglo[j] = aux;
				
				//Los posiciono en el pr�ximo elemento de cada lado. 
				i++;
				j--;
				
			}
			
			//Si no se cumple el if, el while se corta.
			//Quiere decir que el lado derecho lleg� hasta el lado izquierdo
			//dado por el �ndice centro, y que el lado izquierdo lleg� del 
			//lado derecho de centro.
			
		}while(i<=j);
		
		//Salgo del while con un i > que centro y un j < centro
		
		//Si todav�a j es mayor que primero, quiere decir que hay elementos
		//desordenados. Para que est�n ordenados, j=primero
		
		if(primero<j) {
			
			//Ordeno la parte izquierda
			quickSort(arreglo, primero, j);
			
		}
		
		//Si todav�a i es menor que �ltimo, quiere decir que 
		//quedan elementos a la derecha del pivote, est�n desordenados
		//La condici�n de ordenado es i=ultimo
		if(i<ultimo) {
			
			//Ordeno la parte derecha
			quickSort(arreglo, i, ultimo);
			
		}
		
		//Si no cumple ninguna de las dos condiciones, el arreglo est�
		//ordenado. 

	}
	
	
	private static void imprimir(int a[]) {
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(a[i] + "-");
		
		}
	}
}
