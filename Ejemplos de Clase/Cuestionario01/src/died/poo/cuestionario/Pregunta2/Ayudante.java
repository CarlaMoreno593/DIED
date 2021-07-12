package died.poo.cuestionario.Pregunta2;

public class Ayudante extends Docente{
	
	private Integer tipo;
	public Ayudante(Integer i, String n, Integer t) {
		super(1, n);
		this.tipo = t;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Ayudante) {
			
			Ayudante ayud = (Ayudante) obj;
			
			return this.legajo.equals(ayud.legajo) && this.tipo.equals(ayud.tipo);
		}
		return false;
	}
	
	
}
