package cl.jrios.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.jrios.model.ArriendoQuincho;
import cl.jrios.repo.IArriendoQuinchoRepo;
import cl.jrios.service.IArriendoQuinchoService;

@Service
public class ArriendoQuinchoServiceImpl implements IArriendoQuinchoService{
	
	@Autowired
	private IArriendoQuinchoRepo repoArriendo;

	@Override
	public ArriendoQuincho registrar(ArriendoQuincho obj) {
		return repoArriendo.save(obj);
	}

	@Override
	public ArriendoQuincho modificar(ArriendoQuincho obj) {
		return repoArriendo.save(obj);
	}

	@Override
	public List<ArriendoQuincho> listar() {
		return repoArriendo.findAll();
	}

	@Override
	public ArriendoQuincho leerPorId(Integer id) {
		Optional<ArriendoQuincho> op = repoArriendo.findById(id);
		return op.isPresent() ? op.get() : new ArriendoQuincho();
	}

	@Override
	public boolean eliminar(Integer id) {
		repoArriendo.deleteById(id);
		return true;
	}

}
