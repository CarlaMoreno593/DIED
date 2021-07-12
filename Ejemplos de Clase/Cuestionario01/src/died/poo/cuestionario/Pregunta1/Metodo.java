package died.poo.cuestionario.Pregunta1;

public class Metodo {

	public Integer metodo1(Integer x) {
		
		if(x%2==0) throw new MiException();
		return x*2;
		
	}
	
	public void metodo2() {
		Integer r1 = metodo1(3);
		Integer r2 = metodo1(4);
		System.out.println(r1+r2);
	}
	
	public static void main(String[] args) {
		
		Metodo app = new Metodo();
		app.metodo2();
		
	}
}
