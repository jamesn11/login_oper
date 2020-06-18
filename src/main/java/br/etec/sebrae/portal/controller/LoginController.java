package br.etec.sebrae.portal.controller;

import java.util.List;

import org.apache.juli.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.etec.sebrae.portal.dtos.LoginDto;

@Controller
public class LoginController {
    
	//Logger log = LogFactory.getLog(LoginController.class);
	@RequestMapping("/logar")
	public String logar(LoginDto login) {
		
		String emailApi = "admin@admin.com";
		String senhaApi = "123456";
		
		if(emailApi.equals(login.getEmail()) && senhaApi.contentEquals(login.getPassword())) {
          return "redirect:solicitacoes";
        }	
		return "login/cadastro";
	}

	@RequestMapping("/solicitacoes")
	public ModelAndView solicitacoes() {
	        ModelAndView view = new ModelAndView("documentos/solicitacoes");
		   	return view;
	}
	
	@RequestMapping("/cadastroLogin")
	public ModelAndView cadastrarLogin(LoginDto login) {
	ModelAndView view = new ModelAndView("index");	
	view.addObject("sucesso", "Cadastro efetuado com sucesso!");
	return view;
	}
}
