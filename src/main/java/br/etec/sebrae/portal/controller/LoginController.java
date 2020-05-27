package br.etec.sebrae.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("/logar")
	public String logar() {
		return "login/login";
		
	}
	
}
