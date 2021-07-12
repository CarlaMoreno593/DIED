package guia10.problema02;

public class PisoArreglo {
	
	public static void main(String[] args) {
		
		int a[] = {2,2,3,5,6,8,12,45,67,89,112,113};
		
		System.out.println("Piso de 4: " + piso(a,4));
		System.out.println("Piso de 40: " + piso(a,40));
		System.out.println("Piso de 1: " + piso(a,1));
		System.out.println("Piso de 150: " + piso(a,150));
		System.out.println("Piso de 3: " + piso(a,3));
		System.out.println("Piso de 112 " + piso(a,112));

	
	}
	
	//Dado un arreglo ORDENADO, y un numero X, se busca el piso 
	//de x que es el mayor valor del arreglo posible que es menor que x
	//No considera a x como piso de si mismo.
	public static int piso(int[] a, int x) {
		
		return pisoAux(a, x, 0, a.length-1);

	}
	
	public static int pisoAux(int[] a, int x, int inicio, int fin) {
		
		int centro = (inicio + fin)/2;
		
		//imprimir(a, inicio, fin);
		
		if(inicio==fin) {
			
			if(a[inicio]<x ) {
				
				return a[inicio];
				
			}
			else {
				return -1;
			}
		}
		
		//Si x es menor que el primer elemento del arreglo, retorno -1
		if(centro==inicio) {
			
			//Si el primer elemento del arreglo es el piso. El siguiente es mayor
			if(a[centro] < x && a[centro+1]>=x)
				return a[centro];
			else {
				
				//No es el piso, puede que el siguiente sea el piso
				if(a[centro+1]<x)
					return a[centro+1];
				
			}
			return -1;
		}

		//x está entre [centro-1 , x , centro]
		if(a[centro-1] < x && a[centro]>=x) {
			
			return a[centro-1];
			
		}
		else {
			
			//x está entre [centro, x, centro+1]
			if(a[centro]<x && a[centro+1]>=x) {
				
				return a[centro];
				
			}
			
			//Busco por izquierda si x es menor a a[centro]
			if(x<a[centro]) {
				
				return pisoAux(a, x, inicio, centro);
				
			}
			else {
				//busco por derecha si x es mayor que a[centro]
				return pisoAux(a, x, centro+1, fin);
				
			}
		}
		
	}

	public static void imprimir(int a[], int inicio, int fin) {
		
		for(int i=inicio; i<=fin; i++) {
			System.out.print(a[i] + "-");
		}
		System.out.println();
	}
}
