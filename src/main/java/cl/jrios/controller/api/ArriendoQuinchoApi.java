package cl.jrios.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.jrios.dto.ArriendoQuinchoFormDTO;
import cl.jrios.model.ArriendoQuincho;
import cl.jrios.service.impl.ArriendoQuinchoServiceImpl;

@RestController
@RequestMapping("/api/v1/arriendo-quincho")
public class ArriendoQuinchoApi {

	@Autowired
	private ArriendoQuinchoServiceImpl servicioArriendo;

	@GetMapping
	public List<ArriendoQuincho> listarTodos() {
		return servicioArriendo.listar();
	}

	@PostMapping
	public List<ArriendoQuincho> filtra(ModelMap mapa, @RequestBody ArriendoQuinchoFormDTO dto) {
		return servicioArriendo.filtrar(dto);
	}
}
