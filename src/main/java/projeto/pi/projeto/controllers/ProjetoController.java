package projeto.pi.projeto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import projeto.pi.projeto.models.Loja;

@Controller
public class ProjetoController {
	@RequestMapping("/")
	public String Home() {
		return "Home";
	}
	
	@PostMapping("/lojas")
	public String adicionar(Loja loja) {
		System.out.println(loja);
		return "loja-adicionada";
	}
}
