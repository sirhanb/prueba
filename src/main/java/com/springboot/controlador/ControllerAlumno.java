package com.springboot.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerAlumno {

	@RequestMapping("/registro")
	public String registro(Model modelo) {
		modelo.addAttribute("a_nombre","Juana");
		modelo.addAttribute("a_apellido","Perez");
		modelo.addAttribute("a_email","Juanaperez@gmail.com");
		
		return "alumno";
	}
}
