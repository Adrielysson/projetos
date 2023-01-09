package projeto.pi.projeto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import projeto.pi.projeto.models.Loja;
import projeto.pi.projeto.models.Usuario;
import projeto.pi.projeto.repositories.LojaRepository;
import projeto.pi.projeto.repositories.UsuarioRepository;

@Controller
@RequestMapping("/lojas")
public class LojasController {
	
	@Autowired
	private UsuarioRepository ur;
	
	@Autowired
	private LojaRepository lr;
	
	@GetMapping("/form")
	public String form() {
		return "Lojas/formLojas";
	}
	
	@PostMapping
	public String adicionar(Loja loja) {
		System.out.println(loja);
		lr.save(loja);
		return "Lojas/loja-adicionada";
	}
	
	@GetMapping("/login")
	public String login() {
		return "Lojas/Login";
	}
	
	@GetMapping("/entrar")
	public String entrar() {
		return "Lojas/entrar";
	}
	
	@GetMapping("/cadastro")
	public String cadastro() {
		return "Lojas/cadastro";
	}
	
	@PostMapping("/usuario-cadastrado")
	public String usuario(Usuario usuario) {
		System.out.println(usuario);
		ur.save(usuario);
		return "Lojas/usuario-cadastrado";
	}
}
