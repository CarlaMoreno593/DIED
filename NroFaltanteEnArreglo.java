//Ejercicio 01: ArregloN

//El arreglo tiene n valores que están en el rango [0, n-1]. Por ende, hay un valor que no está en el arreglo.
//Se plantean 4 metodos para determinar si se puede
//resolver o no de forma lineal

public class NroFaltanteEnArreglo{

	public static void main(String[] args) {
		
		int[] a = {0,4,2,1, 5,3,7};
		System.out.println("Solución con Formula: ");
		System.out.println("El numero que falta es: " + ArregloN.solLineal(a));
		
		System.out.println("Solución con Arreglo Booleano Auxiliar: ");
		System.out.println("El numero que falta es: " + ArregloN.solLineal2(a));	
	
	}

	//Utiliza la formula de la sumatoria de numeros
	public static int solLineal(int[] a){
		
		//Sumatoria desde 0 hasta N
		int sumaTotal = ((a.length)*(a.length+1))/2;
		int sumaArreglo=0;

		for(int i=0; i<a.length; i++){

			sumaArreglo+=a[i];

		}

		return sumaTotal-sumaArreglo;

	}

	//Utiliza un arreglo booleano auxiliar
	//Es lineal pero utiliza un espacio de memoria auxiliar
	public static int solLineal2(int[] a){

		boolean[] numeros = new boolean[a.length+1];

		for(int i=0; i<a.length; i++){

			numeros[a[i]]=true;

		}

		for(int i=0; i<numeros.length; i++){
			if(!numeros[i])
				
				return i;
		}

		return -1;

	}

}




