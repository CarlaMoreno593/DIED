package ordenamiento.prueba;

import ordenamiento.cuadratico.Burbuja;
import ordenamiento.cuadratico.BurbujaMejorado;
import ordenamiento.cuadratico.InsercionDirecta;
import ordenamiento.cuadratico.SeleccionDirecta;
import ordenamiento.cuadratico.ShakeSort;

public class AppCuadraticos {

	public static void main(String[] args) {
		
		
		int a[] = {99,55,44,22,66,88,33,11};
		int b[] = {99,55,44,22,66,88,33,11};
		int c[] = {99,55,44,22,66,88,33,11};
		int d[] = {99,55,44,22,66,88,33,11};
		int e[] = {99,55,44,22,66,88,33,11};
		
		//Prueba BURBUJA
		Burbuja.burbuja(a);
		System.out.println();
		
		//Prueba BURBUJA MEJORADO
		BurbujaMejorado.burbujaMejorado(b);
		System.out.println();
		
		//Prueba de INSERCIÓN DIRECTA
		InsercionDirecta.insercionDirecta(c);
		System.out.println();
		
		//Prueba de SELECCIÓN DIRECTA
		SeleccionDirecta.seleccionDirecta(d);
		System.out.println();
		
		//Prueba de SHAKE SORT
		ShakeSort.shakeSort(e);
		System.out.println();
	}

}
