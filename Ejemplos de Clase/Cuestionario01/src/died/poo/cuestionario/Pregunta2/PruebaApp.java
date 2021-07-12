package died.poo.cuestionario.Pregunta2;

public class PruebaApp {

	public static void main(String[] args) {
		
		Docente d1 = new Docente(111, "Docente 1");
		Docente d2 = new Docente(111, "Docente 1");
		Docente d3 = d1;
		
		Ayudante a1 = new Ayudante(111, "Ayudante 1", 1);
		Ayudante a2 = new Ayudante(222, "Ayudante 2", 2);
		Ayudante a3 = new Ayudante(111, "Ayudante 1", 1);
		
	
		//Valor 1
		System.out.println(d1.equals(d2));
		
		//Valor 2
		System.out.println(d1.equals(a1));
		
		//Valor 3
		System.out.println(d1.equals(d3));	
		
		//Valor 4
		System.out.println(a1.equals(a2));
		
		//Valor 5
		System.out.println(a1.equals(a3));
		

	}
}
