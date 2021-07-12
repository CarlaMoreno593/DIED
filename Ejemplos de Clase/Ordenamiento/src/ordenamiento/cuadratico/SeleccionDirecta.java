package ordenamiento.cuadratico;

public class SeleccionDirecta {
	
	public static void seleccionDirecta(int arreglo[]) {
		
		int indiceMenor;
		
		int n = arreglo.length;
		System.out.println("SELECCIÓN DIRECTA:");
		SeleccionDirecta.imprimir(arreglo);
		//El de afuera inserta elemento de la posición indiceMenor
		//en la posición i (la actual).
		for(int i=0; i<n; i++) {
			
			//El menor es el que está en la posición actual hasta 
			//que se encuentre uno menor a ese.
			indiceMenor=i;
			
			//Arranco a buscar el menor desde el elemento siguiente
			//al que estoy parada
			for(int j=i+1; j<n; j++) {
				
				//Pregunto si es menor que el del indiceMenor
				if(arreglo[j]<arreglo[indiceMenor]) {
					
					//Si es menor, actualizo el valor de indiceMenor
					indiceMenor = j;
				}
			
			}
			
			//Recorrí todo el arreglo. Consulto si hay un valor menor que
			//el valor de la posición actual. 
			if(indiceMenor!=i) {
				
				//Si encontré uno menor, INTERCAMBIO los valores
				int aux=arreglo[i];
				arreglo[i]=arreglo[indiceMenor];
				arreglo[indiceMenor] = aux;
				
			}
			System.out.println("IndiceMenor = " + indiceMenor + " - i = " + i);
			SeleccionDirecta.imprimir(arreglo);
			
		}
		
	}
	
	private static void imprimir(int a[]) {
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(a[i] + "-");
		
		}
		System.out.println();
	}
	
}
