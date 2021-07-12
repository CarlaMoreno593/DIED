import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import died.poo.cuestionarioA.ClasePadre;
import died.poo.cuestionarioB.ClaseHija;

class PruebaClaseHija {

	@Test
	void test() {
		
		 ClasePadre c1 = new ClaseHija(5);
		 assertEquals(c1.metodo1(2,3), 20);
		 
	}

}
