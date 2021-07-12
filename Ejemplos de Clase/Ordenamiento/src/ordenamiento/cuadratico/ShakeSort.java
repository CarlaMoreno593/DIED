package ordenamiento.cuadratico;

public class ShakeSort {
	
	public static void shakeSort(int a[]) {
		
		int izq, der, aux;
		
		//No se bien para qué es esto.
		int j=a.length-1;
		
		izq = 1; 
		der = a.length-1;
		
		System.out.println("SHAKE SORT:");
		ShakeSort.imprimir(a);
		System.out.println();
		do {
			
			//Arranco desde Izquierda a Derecha
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("Izq-Der");
			for(int i=izq; i<=der; i++) {
				
				//La izquierda arranca en donde el ultimo intercambio ocurrio
				//desde el recorrido derecha a izquierda, es decir, el ultimo valor
				//intercambiado fue el de mas a la izquierda
				//Como el anterior fue de derecha a izquierda, quedara la izquierda
				//desde donde hay que acomodar.
				
				//Si el elemento de mi izquierda (comparo con el elemento
				//de izquierda) es mayor a mi, estoy desordenado
				if(a[i-1]>a[i]) {
					
					//Intercambio de lugares con el de la Izq.
					aux=a[i-1];
					a[i-1] = a[i];
					a[i]=aux;
					
					//Asigno el índice donde intercambié
					j=i;
				}
			}
			
			//Llego al final, actualizo el valor de derecha.
			der=j-1;
			
			
			ShakeSort.imprimir(a);
			System.out.print(" DER = " + der + " ");
			System.out.println();
			
			System.out.println("Der-Izq.");
			//Comienza desde Derecha y se mueve hacia la Izquierda
			//Desde donde se realizó el ultimo intercambio desde izquierda
			//a derecha
			
			for(int i=der; i>=izq; i--) {
				
				//Si el elemento a la izquierda (hacia donde me desplazo)
				//es mayor a mi, entonces estoy desordenado
				if(a[i-1]>a[i]) {
					
					//Intercambio de lugares con el de la Izq.
					aux=a[i-1];
					a[i-1] = a[i];
					a[i]=aux;
					
					//Asigno el indice donde intercambié
					//es decir, donde queda el elemento que fué mayor a mi
					j=i;
					
				}
			}
			
			//Llego al final desde derecha a izquierda.
			//Asigno el nuevo valor de izquierda, donde se produjo el 
			//último cambio y lo incrementa en 1.
			izq=j+1;
			
			
			
			ShakeSort.imprimir(a);
			System.out.print(" IZQ = " + izq +" ");
			System.out.println();
			
		}while(izq<=der);
			
	}
	
	private static void imprimir(int a[]) {
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(a[i] + "-");
		
		}
	}
	
	
}
