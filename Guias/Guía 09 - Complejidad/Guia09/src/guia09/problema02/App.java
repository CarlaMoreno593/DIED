package guia09.problema02;

public class App {
	
	public static void main(String[] args) {
		
		int a[] = {0,1,4,2};
		int b[] = {0,12,13,1,2,3,4,5,7,6,8,9,10};
		
		System.out.println("Falta el nro.: " + VersionCuadratica.falta(a));
		System.out.println("Falta el nro.: " + VersionLineal.falta(a));
	
		System.out.println("Falta el nro.: " + VersionCuadratica.falta(b));
		System.out.println("Falta el nro.: " + VersionLineal.falta(b));
		
		//En el caso cuadratico y lineal, la cantidad de operaciones es casi la misma cuando los elementos están 
		//ordenados de forma creciente. 
	}
}
