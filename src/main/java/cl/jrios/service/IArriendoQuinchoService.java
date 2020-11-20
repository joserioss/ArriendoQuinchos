package cl.jrios.service;

import java.util.List;

import cl.jrios.dto.ArriendoQuinchoFormDTO;
import cl.jrios.model.ArriendoQuincho;

public interface IArriendoQuinchoService extends ICRUD<ArriendoQuincho>{
	public List<ArriendoQuincho> filtrar(ArriendoQuinchoFormDTO dto);

}
