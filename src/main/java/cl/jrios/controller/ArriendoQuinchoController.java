package cl.jrios.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ArriendoQuinchoController {

	@GetMapping
	public String home() {
		return "home";
	}
}
