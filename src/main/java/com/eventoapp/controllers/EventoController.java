package com.eventoapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventoController {
	
	@RequestMapping("evento/cadastrarEvento")
	public String form() {
		return "formEvento";		
	}
}
