package guia09.problema01;

public class App {
	
	public static void main(String[] args) {
		
		//Creo la matriz del PEOR CASO -> creciente en cantidad de 1.
		int[][] a = new int[100][100];
		int[][] b = {{1,1,0,0,0}, 
				     {1,1,1,0,0},
				     {1,1,1,1,0},
				     {1,0,0,0,0},
				     {1,1,1,0,0}
		};
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				a[i][j] = 0;
			}
		}
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<=i; j++) {
				a[i][j] = 1;
			}
		}
		
		//Imprimo matriz a
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
//		//Imprimo matriz b
//		for(int i=0; i<b.length; i++) {
//			for(int j=0; j<b.length; j++) {
//				System.out.print(b[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		System.out.println("Indice de mayor cantidad 1: " + VersionCuadratica.renglon(a));
		System.out.println("Indice de mayor cantidad 1: " + VersionLineal.renglon(a));
		
		System.out.println("Indice de mayor cantidad 1: " + VersionCuadratica.renglon(b));
		System.out.println("Indice de mayor cantidad 1: " + VersionLineal.renglon(b));
		
	}
}
