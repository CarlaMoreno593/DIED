package frsf.isi.died.colecciones.dominio;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Serie implements Comparable<Serie>{
	
	private static Integer GENERADOR_ID = 1; 

	private Integer id;
	private String nombre;
	private Integer calificacion;
	private Integer cantidadReproducciones;	
	private Map<Temporada, Set<Capitulo>> capitulos;
	
	public Serie() {
		super();
	}

	public Serie(String nombre, Integer calificacion, Integer cantidadReproducciones) {
		this(Serie.GENERADOR_ID++,nombre,calificacion,cantidadReproducciones,null);
	}

	public Serie(Integer id, String nombre, Integer calificacion, Integer cantidadReproducciones,
			Map<Temporada, Set<Capitulo>> capitulos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.calificacion = calificacion;
		this.cantidadReproducciones = cantidadReproducciones;
		this.capitulos = capitulos;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(Integer calificacion) {
		this.calificacion = calificacion;
	}
	public Integer getCantidadReproducciones() {
		return cantidadReproducciones;
	}
	public void setCantidadReproducciones(Integer cantidadReproducciones) {
		this.cantidadReproducciones = cantidadReproducciones;
	}
	
	public Map<Temporada, Set<Capitulo>> getCapitulos() {
		return capitulos;
	}

	public void setCapitulos(Map<Temporada, Set<Capitulo>> capitulos) {
		this.capitulos = capitulos;
	}

	public void agregarCapitulo(Temporada t, Capitulo c) {
		if(this.capitulos == null) this.capitulos = new HashMap<>();
		
		if(this.capitulos.get(t)==null) {
			this.capitulos.put(t,new HashSet<>());
		} 
		
		this.capitulos.get(t).add(c);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serie other = (Serie) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Serie [id=" + id + ", nombre=" + nombre + ", calificacion=" + calificacion + ", cantidadReproducciones="
				+ cantidadReproducciones + "]";
	}

	@Override
	public int compareTo(Serie o) {
		return this.calificacion.compareTo(o.calificacion);
	}
	
	
}
