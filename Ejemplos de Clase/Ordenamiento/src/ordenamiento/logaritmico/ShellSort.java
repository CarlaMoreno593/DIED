package ordenamiento.logaritmico;

public class ShellSort {

	public static void shellSort(int[] arreglo) {
		
		int j=0, aux;
		//Indica el tamaño del Gap o hueco entre dos elementos 
		int gap = arreglo.length/2;
		
		//En cada iteración, luego de recorrer todo el arreglo
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
					
					//Si el que está a la Derecha, es mayor que 
					//el de la izquierda, está ordenado
					if(arreglo[j]<=arreglo[j+gap]) {
						
						//Termina. Asume que están 
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
			
			//Reduzco el tamaño del gap cuando ya revisó todo 
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
