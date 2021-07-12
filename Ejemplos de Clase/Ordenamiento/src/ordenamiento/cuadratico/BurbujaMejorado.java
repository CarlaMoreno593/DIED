package ordenamiento.cuadratico;

public class BurbujaMejorado {
	
	public static void burbujaMejorado(int arreglo[]) {
		
		int aux;
		int i, indiceIntercambio;
		
		i=arreglo.length -1;
		System.out.println("BURBUJA MEJORADO: ");
		BurbujaMejorado.imprimir(arreglo);
		
		//Mientras el indice a partir del cu�l los elementos est�n ordenados
		//no sea el 0 (es decir, mientras haya intercambios en 
		//elementos que est�n a lo �ltimo del arreglo
		while(i>0) {
			
			//Considero que est� ordenado
			indiceIntercambio = 0;
			
			//Solo recorrer� hasta el �ndice donde los elementos
			//est�n desordenados
			for(int j=0; j<i; j++) {
				
				//Comparo con el de la derecha.
				//Si el de la derecha es menor que yo, intercambio
				if(arreglo[j] > arreglo[j+1]) {
					
					aux=arreglo[j];
					arreglo[j]=arreglo[j+1];
					arreglo[j+1] = aux;
					
					//El �ndice j indica que estaba desordenado
					//por lo que posiblemente siga desordenado
					indiceIntercambio = j;
				}
			
			}
			
			//Si hubo intercambios, entonces indiceIntercambio
			//tendr� el �ltimo j intercambiado, a partir del cual 
			//los elementos est�n ordenados. Y la proxima ronda de 
			//intercambios solo se har� hasta ese indice
			
			//Si NO hubo intercambios, u ocurri� en el primero elemento
			//i=0. Condici�n de corte del while, indicando que el elemento est� ordenado
			//ya que m�s adelante no se produjeron intercambios
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

