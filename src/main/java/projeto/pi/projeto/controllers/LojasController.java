package projeto.pi.projeto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import projeto.pi.projeto.models.Loja;
import projeto.pi.projeto.repositories.LojaRepository;

@Controller
public class LojasController {
	
	@Autowired
	private LojaRepository lr;
	
	@RequestMapping("lojas/form")
	public String form() {
		return "formLojas";
	}
	
	@PostMapping("/lojas")
	public String adicionar(Loja loja) {
		System.out.println(loja);
		lr.save(loja);
		return "loja-adicionada";
	}
}
