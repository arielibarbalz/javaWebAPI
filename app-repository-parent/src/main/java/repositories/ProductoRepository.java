package repositories;

import dtos.ProductoDTO; 

public interface ProductoRepository {
	//CREATE
	public void save(ProductoDTO entity);
	//READ
	public ProductoDTO getById(Long id);
	//UPDATE
	public ProductoDTO update(ProductoDTO entity);
	//DELETE
	public ProductoDTO delete(Long id);
}
