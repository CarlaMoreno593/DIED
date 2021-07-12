package died.poo.cuestionarioB;

import died.poo.cuestionarioA.ClasePadre;

public class App {

	public static void main(String[] args) {

		 
		 ClasePadre c1 = new ClaseHija(5);
		 //Da 20->Seguir trazo
		 System.out.println("Resultado: "+ c1.metodo1(2,3));
		 /*Trazo metodo 1:
		  * llama al metodo del Hija, ya que la instancia es hija). Hija, el metodo no hace "this.at1", por lo que toma el valor con el que se creo la instancia Hija (5)
		  * Luego se ejecuta this.metodo1(2*3), el this hace referencia a c1, declarado como ClasePadre, por lo que ejecuta el metodo de clase Padre
		  * metodo1 de clase padre tampoco usa this.at1, por lo que usa el valor definido por clasePadre, que es 3 (el constructor incializa esa variable en 3)
		  */
		 
		 //Con esto no compila, pero aunque ClaseHija tenga un error, funciona.
		 /*ClaseHija c1 = new ClaseHija(5);
		 c1.imprimir();*/
		 
		 //Da 17
		 ClasePadre c2 = new ClasePadre(5);
		 System.out.println("Resultado: "+c2.metodo1(2,3));
	}

}
