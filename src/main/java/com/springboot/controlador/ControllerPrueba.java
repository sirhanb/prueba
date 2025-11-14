package com.springboot.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerPrueba {
	
	@RequestMapping("/prueba")
	public String abrir() {
		return "index";
	}
	
}
