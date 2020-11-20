package cl.jrios.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.jrios.model.Departamento;
import cl.jrios.repo.IDepartamentoRepo;
import cl.jrios.service.IDepartamentoService;

@Service
public class DepartamentoServiceImpl implements IDepartamentoService{
	
	@Autowired
	private IDepartamentoRepo repoArriendo;

	@Override
	public Departamento registrar(Departamento obj) {
		return repoArriendo.save(obj);
	}

	@Override
	public Departamento modificar(Departamento obj) {
		return repoArriendo.save(obj);
	}

	@Override
	public List<Departamento> listar() {
		return repoArriendo.findAll();
	}

	@Override
	public Departamento leerPorId(Integer id) {
		Optional<Departamento> op = repoArriendo.findById(id);
		return op.isPresent() ? op.get() : new Departamento();
	}

	@Override
	public boolean eliminar(Integer id) {
		repoArriendo.deleteById(id);
		return true;
	}

}
