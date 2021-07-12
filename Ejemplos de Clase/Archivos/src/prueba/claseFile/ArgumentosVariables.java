package prueba.claseFile;

import java.util.ArrayList;
import java.util.List;

public class ArgumentosVariables {

	public static void main(String[] args) {
		
		ArgumentosVariables a = new ArgumentosVariables();
		
		a.add("arriba", "abajo", "hola");
		
		String[] ar = {"hola", "abajo"};
		
		a.add(ar);

		
		
	}
	
	public List<String> add(String... palabras) {
		
		List<String> lista = new ArrayList<String>();
		
		for(String unaP : palabras) {
			
			lista.add(unaP);
		}
		
		System.out.println(palabras[0]);
		
		return lista;
	}
}
