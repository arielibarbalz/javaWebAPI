package repositories;

import dtos.ProductoDTO;

public class ProductoRepositoryMySqlImpl implements ProductoRepository {

	@Override
	public void save(ProductoDTO entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProductoDTO getById(Long id) {
		// TODO Auto-generated method stub
		//harcode
		String sql= "SELECT * from producto wheree id="+id;
		System.out.println(sql);
		//simulo que obtengo los datos de la DB
		Long _id= id;
		String titulo = "producto simulado desde la DB";
		Double precio = 15000.75;
		//instancio mi ProductoDTO
		return new ProductoDTO(_id, titulo, precio);
	}

	@Override
	public ProductoDTO update(ProductoDTO entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductoDTO delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}


}
