package frsf.isi.died.colecciones.dominio;

public class SerieExistenteException  extends Exception {

	public SerieExistenteException() {
		super("La serie ya existe en el catálogo");
	}
}
