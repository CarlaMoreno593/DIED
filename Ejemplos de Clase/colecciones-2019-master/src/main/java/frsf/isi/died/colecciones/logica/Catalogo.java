package frsf.isi.died.colecciones.logica;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import frsf.isi.died.colecciones.dominio.Serie;
import frsf.isi.died.colecciones.dominio.SerieExistenteException;

public class Catalogo {

	private enum TipoColeccion { TABLA_HASH, ARBOL, TABLA_HASH_ENLAZADA } 
	
	private Set<Serie> catalogo;
	private TipoColeccion tipoColeccion;
	

	public Catalogo() {
		this.usarHashSet();
	}
	
	public void usarHashSet() {
		tipoColeccion=TipoColeccion.TABLA_HASH;
		if(this.catalogo == null) this.catalogo = new HashSet<>();
		else this.catalogo = new HashSet<>(this.catalogo);
	}

	public void usarTreeSet() {
		tipoColeccion=TipoColeccion.ARBOL;
		if(this.catalogo == null) this.catalogo = new TreeSet<>();
		else this.catalogo = new TreeSet<>(this.catalogo);
	}

	public void usarLinkedHashSet() {
		tipoColeccion=TipoColeccion.TABLA_HASH_ENLAZADA;
		if(this.catalogo == null) this.catalogo = new LinkedHashSet<>();
		else this.catalogo = new LinkedHashSet<>(this.catalogo);
	}

	public Catalogo agregar(Serie s) throws SerieExistenteException {
		boolean agregado = this.catalogo.add(s);
		if(!agregado) throw new SerieExistenteException();
		return this;
	}

	public Catalogo agregar(String nombre,Integer calificacion,Integer reprod) throws SerieExistenteException {
		boolean agregado = this.catalogo.add(new Serie(nombre,calificacion,reprod));
		if(!agregado) throw new SerieExistenteException();
		return this;
	}

	public void catalogoHashSet() {
		System.out.println("TIPO ESTRUCTURA: "+this.tipoColeccion);
	}
}
