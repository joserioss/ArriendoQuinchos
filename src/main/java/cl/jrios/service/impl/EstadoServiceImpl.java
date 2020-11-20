package cl.jrios.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.jrios.model.Estado;
import cl.jrios.repo.IEstadoRepo;
import cl.jrios.service.IEstadoService;

@Service
public class EstadoServiceImpl implements IEstadoService{
	
	@Autowired
	private IEstadoRepo repoArriendo;

	@Override
	public Estado registrar(Estado obj) {
		return repoArriendo.save(obj);
	}

	@Override
	public Estado modificar(Estado obj) {
		return repoArriendo.save(obj);
	}

	@Override
	public List<Estado> listar() {
		return repoArriendo.findAll();
	}

	@Override
	public Estado leerPorId(Integer id) {
		Optional<Estado> op = repoArriendo.findById(id);
		return op.isPresent() ? op.get() : new Estado();
	}

	@Override
	public boolean eliminar(Integer id) {
		repoArriendo.deleteById(id);
		return true;
	}

}
