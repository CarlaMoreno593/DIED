package db.domain;

public class Libro {
	
	private Integer id;
	private String titulo;
	private Integer paginas;
	private Double precio;
	
	
	public Libro() {
	}
	
	
	public Libro(Integer id, String titulo, Integer paginas, Double precio) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.paginas = paginas;
		this.precio = precio;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Integer getPaginas() {
		return paginas;
	}
	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	

}
