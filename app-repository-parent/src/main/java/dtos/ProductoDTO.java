package dtos;

public class ProductoDTO {
	
	private Long id;
	private String titulo;
	private Double precio;
	
	//mutable / inmutable
	
	public ProductoDTO(Long id, String titulo, Double precio) {
		
		setId(id);
		this.titulo = titulo; //hay control ?
		this.precio = precio;
	}
	
	private void setId(Long id) {
		if(id == null || id < 0 ) {
			throw new IllegalArgumentException("Id no puede ser nulo ni menor que 0");//runtime exception, corta el flujo y no se instancia
		}
		this.id = id;
		
	}

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public Double getPrecio() {
		return precio;
	}
	
	//completar
	
	
	
	
}
