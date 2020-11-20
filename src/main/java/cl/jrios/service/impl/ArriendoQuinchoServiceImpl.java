package cl.jrios.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.jrios.dto.ArriendoQuinchoFormDTO;
import cl.jrios.model.ArriendoQuincho;
import cl.jrios.model.Departamento;
import cl.jrios.model.Estado;
import cl.jrios.repo.IArriendoQuinchoRepo;
import cl.jrios.repo.IDepartamentoRepo;
import cl.jrios.repo.IEstadoRepo;
import cl.jrios.service.IArriendoQuinchoService;

@Service
public class ArriendoQuinchoServiceImpl implements IArriendoQuinchoService{
	
	@Autowired
	private IArriendoQuinchoRepo repoArriendo;
	
	@Autowired
	private IEstadoRepo estadoRepo;
	
	@Autowired
	private IDepartamentoRepo departamentoRepo;

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

	@Override
	public List<ArriendoQuincho> filtrar(ArriendoQuinchoFormDTO dto) {
		Estado estado = estadoRepo.findById(dto.getEstado_id()).orElse(null);
		Departamento departamento = departamentoRepo.findById(dto.getDepartamento_id()).orElse(null);
		return repoArriendo.findAllByFechaBetweenAndEstadoAndDepartamento(dto.getFecha_desde(), dto.getFecha_hasta(), estado, departamento);
	}

}
