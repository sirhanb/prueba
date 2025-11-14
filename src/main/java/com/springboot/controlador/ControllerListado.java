package com.springboot.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerListado {
	
	@RequestMapping("/visualizar")
	public String listado() {
		return "listado";
	}

	@RequestMapping("/lista")
	public String mostrarListado(Model model) {
		
		List<String> productos = new ArrayList<String>();
		productos.add("Descripcion de producto1");
		productos.add("Descripcion de producto2");
		productos.add("Descripcion de producto3");
		productos.add("Descripcion de producto4");
		productos.add("Descripcion de producto5");
		
		model.addAttribute("productos",productos);
		
		return "lista";
		
	}
}
