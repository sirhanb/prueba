package com.springboot.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerPrueba {
	
<<<<<<< HEAD
	@RequestMapping("/aperturar")
	public String abrir() {
		return "prueba";
	}
	

=======
	@RequestMapping("/prueba")
	public String abrir() {
		return "index";
	}
	
>>>>>>> 9f5aaa8 (Se agrega act2)
}
