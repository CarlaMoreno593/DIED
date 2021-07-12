/**
 * 
 */
package died.claseonline.ejemplos;

/**
 * @author CarlaMoreno
 *	
 * Esta clase tiene como objetivos mostrar como ejemplo funcionamiento de Java
 * 
 * @see Double
 * 
 * {@code} a+b
 * 
 * 
 */
public class Ejemplo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int x=10;
		int z=x;
		x = 120;
		
		System.out.println("x: " + x + " z: "+z);
		
		//Sin cast erroja error ya que los argumentos pasados son enteros
		//Aunque sean numeros, requieren de conversion explicita.
		//Datos01 var1 = new Datos01(44,33,56,99);
		
		Datos01 var1 = new Datos01(44,(short) 33,56L,99);
		
		//Con este, temporal perdió precision
		//var1.ejemplo01((byte) 120);
		
		//Esta linea va a tirar un error: "java.lang.NullPointer"
		//var1.ejemplo02(null);
		
		//Arroja mismo error que anterior
		//String dato=null;
		//var1.ejemplo02(dato);
	
		//Si agrego un & al metodo ejemplo02 se arregla
		//&& en lugar de &
		//Esto ocurre porque el && evalua solo la primera parte (!= null)
		//Mientras que & evalua las dos, por lo que evalua !=null y evalua la 
		//longitud, al evaluar la longitud sobre un null, sale error
		//LO PRIMERO QUE HAY QUE EVALUAR ES QUE LA VARIABLE NO SEA NULL
		String dato=null;
		var1.ejemplo02(dato);
		
		var1.w=99;
		var1.y=55;
		
		//Si creo un paquete nuevo con una clase que tenga a clase Datos01
		//al intentar asignar z arroja error porque esta protegido.
		//el alcance de la variable protegida es el paquete.
		//afuera del paquete no puede ser accedida salvo que la clase extienda de esta
		//Protegido puedo ver si heredo
		var1.z=100;
		
		//Arroja error porque x no es visible
		//Solo es visible en la clase. No se ve ni en herencia ni en otra clase del mismo paquete
		//var1.x=10;
		
		String a = "    a";
		System.out.println("Longitud de a: " + a.length());
		
	}

}
