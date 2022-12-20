package projeto.pi.projeto.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProjetoController {
	@RequestMapping("/")
	public String Home() {
		return "Home";
	}

}
