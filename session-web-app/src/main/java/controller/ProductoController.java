package controller;

import java.io.IOException;

import ProcuctoService.ProductoService;
import ProcuctoService.ProductoServiceImpl;
import dtos.ProductoDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
// 1 convierto en webServlet
@WebServlet("/api/producto")
public class ProductoController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//busca un productyo en la DB por su ID
		//Capturo el pararmetro desde el req
		String id = req.getParameter("id");
		Long idL = Long.parseLong(id);


		//instancio el servicio
		ProductoService service = new ProductoServiceImpl();
		//obtengo el producto usando el service
		ProductoDTO productoDTO = service.getById(idL);
		//propio de los Servlets para escribir en el response
		resp.getWriter().print(productoDTO.toString());

	}
	
	
	
}
