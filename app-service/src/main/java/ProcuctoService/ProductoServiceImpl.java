package ProcuctoService;

import dtos.ProductoDTO;
import repositories.ProductoRepository;
import repositories.ProductoRepositoryMySqlImpl;

public class ProductoServiceImpl implements ProductoService{
	
	//implemento los metodos de la interface
	//inyeccion de dependencia
	//atributo de tipo interface: ProductoRepository
	private ProductoRepository repository;

	public ProductoServiceImpl(){
		inyectarClases();
	}
	public void inyectarClases(){
		this.repository = new ProductoRepositoryMySqlImpl();
	}
	
	@Override
	public ProductoDTO getById(Long id) {
		//ahora si accedo a la base por medio del repository
		return this.repository.getById(id);
	}
	

}
