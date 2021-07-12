package died.poo.cuestionarioB;

import died.poo.cuestionarioA.ClasePadre;

public class ClaseHija extends ClasePadre{
	
	private Integer at1;
	
	public ClaseHija() {
		
	}
	
	public ClaseHija(Integer at1) {
		super();
		this.at1=at1;
	}
	
	public Integer metodo1(Double x) {
		return (int)(at1+x);
	}
	
	public Integer metodo1(Integer x, Integer y) {
		
		return at1+this.metodo1(x*y);
		
	}
	
	public void imprimir() {
		System.out.println("At1 " + this.at1);
		System.out.println("At2 " + this.at2);
		System.out.println("At3 " + this.at3);
	}
}
