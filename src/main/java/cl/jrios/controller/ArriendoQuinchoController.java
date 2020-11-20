package cl.jrios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.jrios.dto.ArriendoQuinchoFormDTO;
import cl.jrios.service.impl.ArriendoQuinchoServiceImpl;
import cl.jrios.service.impl.DepartamentoServiceImpl;
import cl.jrios.service.impl.EstadoServiceImpl;

@Controller
@RequestMapping("/")
public class ArriendoQuinchoController {

	@Autowired
	private ArriendoQuinchoServiceImpl servicioArriendo;
	
	@Autowired
	private EstadoServiceImpl servicioEstado;
	
	@Autowired
	private DepartamentoServiceImpl servicioDepartamento;
	
	@GetMapping
	public String home(ModelMap mapa) {
		mapa.put("arriendos", servicioArriendo.listar());
		mapa.put("estados", servicioEstado.listar());
		mapa.put("departamentos", servicioDepartamento.listar());
		return "home";
	}
	
	@PostMapping
	public String filtra(ModelMap mapa, @ModelAttribute ArriendoQuinchoFormDTO dto){
		mapa.put("arriendos", servicioArriendo.filtrar(dto));
		mapa.put("estados", servicioEstado.listar());
		mapa.put("departamentos", servicioDepartamento.listar());
		return "home";
	}
}
