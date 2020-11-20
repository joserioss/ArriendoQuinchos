package cl.jrios.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.jrios.model.Departamento;

public interface IDepartamentoRepo extends JpaRepository<Departamento, Integer>{

}
