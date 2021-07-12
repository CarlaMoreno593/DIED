package ordenamiento.cuadratico;

public class Burbuja {

	public static void burbuja(int arreglo[]) {
		
		int aux;
		System.out.println("BURBUJA: ");
		Burbuja.imprimir(arreglo);
		//Tengo que hacer n-1 pasadas en un arreglo de n elementos
		for(int i=0; i<(arreglo.length-1); i++) {
			
			//Comparo desde 0 hasta [n-1]-i, ya que en cada 
			//iteración el más grande se ubica al final, y queda ordenado
			
			for(int j=0; j<(arreglo.length-1)-i; j++) {
				
				//Comparo con el de la derecha.
				//Si el de la derecha es menor que yo, intercambio
				if(arreglo[j] > arreglo[j+1]) {
					
					aux=arreglo[j];
					arreglo[j]=arreglo[j+1];
					arreglo[j+1] = aux;
				
				}
			
			}
			
			Burbuja.imprimir(arreglo);
			
		}
	}
	
	private static void imprimir(int a[]) {
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(a[i] + "-");
		
		}
		System.out.println();
	}
}
