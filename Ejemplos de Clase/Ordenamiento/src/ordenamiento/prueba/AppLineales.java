package ordenamiento.prueba;

import ordenamiento.lineal.BinSort;
import ordenamiento.lineal.CountingSort;
import ordenamiento.lineal.RadixSort;

public class AppLineales {
	
	public static void main(String[] args) {
		
		int[] a = {5,9,8,7,7,5,4,3,2,1};
		int[] b = {29,55,21,67,66,88,33,11};
//		//Prueba BIN SORT: Arreglo auxiliar
//		BinSort.binSortConArregloAux(a, 10);
//		
//		//Prueba BIN SORT: Sin Arreglo Auxiliar
//		BinSort.binSortSinArregloAux(a);
//	
//		//Prueba BIN SORT: Con Repetidos
//		BinSort.binSortRepetidos(a, 9);
//		
//		//Prueba del COUNTING SORT:
//		CountingSort.countingSort(a);
		
		RadixSort.radixSort(b);
	}
}
