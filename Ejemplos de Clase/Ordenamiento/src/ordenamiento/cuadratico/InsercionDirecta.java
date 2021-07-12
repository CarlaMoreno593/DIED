package ordenamiento.cuadratico;

public class InsercionDirecta {
	
	public static void insercionDirecta(int arreglo[]) {
		
		//Mantendr� el valor que se quiere insertar 
		int aux;
		//Para recorrer el subarreglo que va desde el elemento i 
		//que se quiere insertar hasta el elemento 0 (comienzo del arreglo)
		int j;
		
		System.out.println("INSERCI�N DIRECTA: ");
		InsercionDirecta.imprimir(arreglo);
		//Debo recorrer todo el arreglo. 
		for(int i=0; i<arreglo.length; i++) {
			
			//Mantiene el indice actual, pero va a moverse hacia el comienzo
			j=i; 
			aux = arreglo[i];
			
			//Mientras no estoy al comienzo del arreglo
			//y el valor de i pueda insertarse al comienzo del arreglo
			//debido a que su valor es menor
			//Busca el hueco donde va a insertar el elemento
			while(j>0 && arreglo[j-1]>aux) {
				
				//Desplazo a la derecha una posici�n 
				//para que en la siguiente iteraci�n se mueva a la derecha
				//el que sigue o se inserte aux.
				arreglo[j]=arreglo[j-1];
				j--;
				
			}
			
			//Si sali� del while porque j=0, entonces se inserta en la 
			//primera posici�n. 
			//Si por ejemplo, j=i, y el elemento j-1 es menor a aux
			//entonces es lo mismo que si hiciera arreglo[i]=aux, no se cambi�
			//de posici�n el elemento
			arreglo[j]=aux;
			System.out.println("J = " + j);
			InsercionDirecta.imprimir(arreglo);
			
		}
		
	}
	
	private static void imprimir(int a[]) {
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(a[i] + "-");
		
		}
		System.out.println();
	}
	
}
