package com.springboot.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerListar {

	@RequestMapping("/listar")
	public String Listado() {
	   return "visualizar";	
	}
	
}
