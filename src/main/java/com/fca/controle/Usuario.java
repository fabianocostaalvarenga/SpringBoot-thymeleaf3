package com.fca.controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Usuario {

	@GetMapping("/usuario/novo")
	public String novo(){
		return "seguranca/usuario/novo-usuario";
	}
	
}
