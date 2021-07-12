package died.poo.cuestionarioA;

public class ClasePadre {
	
	private Integer at1;
	protected final Integer at2 = 10;
	//Sin modificador de accesso, no será vista en ClaseHija, dado
	//que el modificador por defecto solo tiene alcance de paquete.
	Integer at3;
	
	public ClasePadre() {
		this.at1=3;
		this.at3=6;
		
	}
	
	public ClasePadre(Integer a1) {
		this();
		this.at1 = a1;
	}
	
	public Integer metodo1(Integer x) {
		return at3 + at1 + x;
	}
	
	public Integer metodo1(Integer x, Integer y) {
		return at3 + at1 + (x*y);
	}
}
