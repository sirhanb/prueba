package com.springboot.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.modelo.Producto;

@Controller
public class ControllerProducto {

	@RequestMapping("/listarp")
	public String mostrarProducto(Model model) {
		Producto producto = new Producto();
		producto.setId(1);
		producto.setNombre("Laptop");
		producto.setDescripcion("Laptop lenovo de i5");
		producto.setPrecio(1526);
		
		model.addAttribute("producto",producto);
		
		return "producto";
	}
	
}
