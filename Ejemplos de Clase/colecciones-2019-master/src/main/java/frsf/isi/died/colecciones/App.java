package frsf.isi.died.colecciones;

import java.util.Random;

import frsf.isi.died.colecciones.dominio.Serie;
import frsf.isi.died.colecciones.dominio.SerieExistenteException;
import frsf.isi.died.colecciones.logica.Catalogo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )    {
    	Catalogo c = new Catalogo();
    	try {
			c.agregar("Breaking Bad",rand(90),rand(50000)).agregar("Lost",rand(90),rand(50000)).agregar("GoT",95,843469);
		} catch (SerieExistenteException e) {
			e.printStackTrace();
		}
    }
    
    public static Integer rand(int minima) {
    	Random r = new Random();
    	return r.nextInt(minima);
    }
}
