package projeto.pi.projeto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LojasController {
	@RequestMapping("lojas/form")
	public String form() {
		return "formLojas";
	}
}
