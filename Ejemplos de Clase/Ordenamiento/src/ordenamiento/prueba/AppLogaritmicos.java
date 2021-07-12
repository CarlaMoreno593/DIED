package ordenamiento.prueba;

import ordenamiento.logaritmico.MergeSort;
import ordenamiento.logaritmico.QuickSort;
import ordenamiento.logaritmico.ShellSort;

public class AppLogaritmicos {

	public static void main(String[] args) {
		
		int a[] = {99,55,44,22,66,88,33,11};
		int b[] = {99,55,44,22,66,88,33,11};
		int c[] = {99,55,44,22,66,88,33,11};
		int d[] = {99,55,44,22,66,88,33,11};
		int e[] = {99,55,44,22,66,88,33,11};
		
//		//Prueba SHELL SORT
//		ShellSort.shellSort(a);
//		System.out.println();
//		
//		//Prueba MERGE SORT
//		MergeSort.mergeSort(b);
//		System.out.println();
		
		//Prueba QUICK SORT
		QuickSort.quickSort(c);
		
	}
}
