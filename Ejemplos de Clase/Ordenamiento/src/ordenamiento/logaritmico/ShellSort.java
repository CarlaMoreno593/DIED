package ordenamiento.logaritmico;

public class ShellSort {

	public static void shellSort(int[] arreglo) {
		
		int j=0, aux;
		//Indica el tama�o del Gap o hueco entre dos elementos 
		int gap = arreglo.length/2;
		
		//En cada iteraci�n, luego de recorrer todo el arreglo
		//y haber comparado con todos los elementos, debo reducir 
		//el Gap.
		System.out.println("SHELL SORT:");
		ShellSort.imprimir(arreglo);
		System.out.println();
		while(gap>0) {
			
			System.out.println("Gap = " + gap);
			//Arranco comparando desde gap 
			for(int i=gap; i<arreglo.length; i++) {
				
				j=i-gap;
				System.out.print("i-gap = " + i + " ");
				
				while(j>=0) {
					
					//Si el que est� a la Derecha, es mayor que 
					//el de la izquierda, est� ordenado
					if(arreglo[j]<=arreglo[j+gap]) {
						
						//Termina. Asume que est�n 
						//todos los de la izq. ordenados
						j=-1;
						
					}
					else {
						//El de la Derecha es menor que el de la Izquieda
						//Los acomodo
						aux = arreglo[j];
						arreglo[j]=arreglo[j+gap];
						arreglo[j+gap] = aux;
						
						//Decremento j para ver si debo comparar
						//Con otros elementos
						j-=gap;
					}
					
					System.out.print("J = " + j + " ");
					ShellSort.imprimir(arreglo);
					System.out.println();
				}
			}
			
			//Reduzco el tama�o del gap cuando ya revis� todo 
			//el arreglo con el gap anterior.
			gap/=2; 
		}
	}
	
	
	
	
	
	private static void imprimir(int a[]) {
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(a[i] + "-");
		
		}
	}
}
