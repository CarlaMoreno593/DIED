package ordenamiento.cuadratico;

public class SeleccionDirecta {
	
	public static void seleccionDirecta(int arreglo[]) {
		
		int indiceMenor;
		
		int n = arreglo.length;
		System.out.println("SELECCI�N DIRECTA:");
		SeleccionDirecta.imprimir(arreglo);
		//El de afuera inserta elemento de la posici�n indiceMenor
		//en la posici�n i (la actual).
		for(int i=0; i<n; i++) {
			
			//El menor es el que est� en la posici�n actual hasta 
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
			
			//Recorr� todo el arreglo. Consulto si hay un valor menor que
			//el valor de la posici�n actual. 
			if(indiceMenor!=i) {
				
				//Si encontr� uno menor, INTERCAMBIO los valores
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
