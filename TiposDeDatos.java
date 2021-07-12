package died.claseonline.ejemplos;

/**
 * Clase de ejemplo 
 * 
 */
public class Datos01 {
	
	private int x;
	public short y;
	protected long z;
	Integer w;
	
	public Datos01(int x, short y, long z, Integer w) {
		
		super();
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}
	
	public void ejemplo01(byte param1){
		
		//byte tiene 8 bits
		//short tiene 16 bits
		//int tiene 32 bits
		//long tiene 64 bits
		
		x=param1;
		
		System.out.println("El valor de x es " + x);
		
		//El IDE te marca el error si no está el casting. Si quiero ejecutar no va a compilar
		//La sugerencia te propone agregar cast
		y=(short) x;
		
		System.out.println("El valor de y es " + y);
		//Se puede asignar sin problema un int a un long
		z=x;
		
		System.out.println("El valor de z es " + z);
		
		z=z+w;
		
		System.out.println("El valor de z es " + z);
		
		System.out.println("El valor de 10000*x es " + x*10000);
		
		//Arroja error si no hay cast
		byte temporal=(byte) (10000*x);
		System.out.println("El valor de temporal es " + temporal);
		
		System.out.println("1200000 en binario " + Integer.toBinaryString(1200000));
		
	}
	
	public void ejemplo02(String dato) {
		
		if(dato != null && dato.length()>0) {
			System.out.println("Ingreso dato "+ dato);
		}
		
		System.out.println("Debe ingresar un dato");
		
	}
	
	
}
