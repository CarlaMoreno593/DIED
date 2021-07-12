package ordenamiento.lineal;

public class CountingSort {

	
	//Distribution Counting
	//Es una variante de BinSort
	
	public static void countingSort(int arreglo[]) {
	
		System.out.println("COUNTING SORT: ");
		imprimir(arreglo);
		System.out.println();
		
		int maximo = maximo(arreglo);
		
		//Mantendrá la cantidad de ocurrencias de cada elemento
		int[] conteo = new int[maximo+1];
		
		//Inicializo el arreglo conteo
		for(int i=0; i<maximo; i++) {
			
			conteo[i]=0;
			
		}
		
		//Cuento la cantidad de veces que aparece cada elemento en 
		//el arreglo
		for(int i=0; i<arreglo.length; i++) {
			
			//Incrementa en uno
			conteo[arreglo[i]]++;
		
		}
		System.out.println("Ocurrencias de cada elemento ");
		imprimir(conteo);
		System.out.println();
		
		//Sumo cada elemento de conteo con el anterior, para determinar
		//el rango de la posición donde el elemento se almacenará
		for(int i=1; i<maximo+1; i++) {
			
			conteo[i]+=conteo[i-1];
			
		}
		
		System.out.println("Indice máximo de cada elemento: ");
		imprimir(conteo);
		System.out.println();
		
		//Declaro un arreglo auxiliar que contendrá los elementos de arreglo
		int aux[] = new int[arreglo.length];
		
		System.out.println("Ordenamiento: ");
		//Arranca desde la derecha hacia la izquierda. Tiene sentido
		//ya que los elementos de conteo contienen el indice de la derecha
		int s=0;
		for(int i=arreglo.length-1; i>=0; i--) {
			
			//Asigno en el índice de más a la derecha que le corresponde
			//al elemento i del arreglo
			//Es menos 1, porque el contador almacena lo del 1 en el cero
			s = arreglo[i];
			aux[conteo[s]-1]=s;
			//Muevo una posición a la izquierda para el siguiente elemento
			conteo[s]--;
			
			System.out.print("Arreglo = ");
			imprimir(aux);
			System.out.print("Conteo = ");
			imprimir(conteo);
			System.out.println();
		}
		
		arreglo = aux;
	
	}
	
	private static int maximo(int[] arreglo) {
		
		int max=-1;
		
		for(int i=0; i<arreglo.length; i++) {
			
			if(arreglo[i]>max) {
				max=arreglo[i];
			}
		}
		
		return max;
	}
	
	
	private static void imprimir(int a[]) {
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(a[i] + "-");
		
		}
		System.out.println();
	}
	
}
