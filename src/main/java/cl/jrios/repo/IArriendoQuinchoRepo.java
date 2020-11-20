package cl.jrios.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.jrios.model.ArriendoQuincho;
import cl.jrios.model.Departamento;
import cl.jrios.model.Estado;

public interface IArriendoQuinchoRepo extends JpaRepository<ArriendoQuincho, Integer> {

//	Filtro completo de todos los elementos del formulario
	List<ArriendoQuincho> findAllByFechaBetweenAndEstadoAndDepartamento(String desde, String hasta, Estado estado,
			Departamento departamento);
	/*
	 * En caso de querer hacer un filtro solo de fechas estaria bien con:
	 * List<ArriendoQuincho> findAllByFechaBetween( String desde, String hasta );
	 */
}
