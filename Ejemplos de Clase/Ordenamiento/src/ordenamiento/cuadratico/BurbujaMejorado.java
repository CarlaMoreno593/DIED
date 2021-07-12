package ordenamiento.cuadratico;

public class BurbujaMejorado {
	
	public static void burbujaMejorado(int arreglo[]) {
		
		int aux;
		int i, indiceIntercambio;
		
		i=arreglo.length -1;
		System.out.println("BURBUJA MEJORADO: ");
		BurbujaMejorado.imprimir(arreglo);
		
		//Mientras el indice a partir del cuál los elementos están ordenados
		//no sea el 0 (es decir, mientras haya intercambios en 
		//elementos que estén a lo último del arreglo
		while(i>0) {
			
			//Considero que está ordenado
			indiceIntercambio = 0;
			
			//Solo recorrerá hasta el índice donde los elementos
			//estén desordenados
			for(int j=0; j<i; j++) {
				
				//Comparo con el de la derecha.
				//Si el de la derecha es menor que yo, intercambio
				if(arreglo[j] > arreglo[j+1]) {
					
					aux=arreglo[j];
					arreglo[j]=arreglo[j+1];
					arreglo[j+1] = aux;
					
					//El índice j indica que estaba desordenado
					//por lo que posiblemente siga desordenado
					indiceIntercambio = j;
				}
			
			}
			
			//Si hubo intercambios, entonces indiceIntercambio
			//tendrá el último j intercambiado, a partir del cual 
			//los elementos están ordenados. Y la proxima ronda de 
			//intercambios solo se hará hasta ese indice
			
			//Si NO hubo intercambios, u ocurrió en el primero elemento
			//i=0. Condición de corte del while, indicando que el elemento está ordenado
			//ya que más adelante no se produjeron intercambios
			i=indiceIntercambio;
			System.out.println("INDICE INTERCAMBIO: " + i);
			BurbujaMejorado.imprimir(arreglo);
			
		}
	}
	
	private static void imprimir(int a[]) {
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(a[i] + "-");
		
		}
		System.out.println();
	}
	
}

