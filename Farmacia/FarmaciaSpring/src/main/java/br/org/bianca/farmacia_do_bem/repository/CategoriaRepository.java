package br.org.bianca.farmacia_do_bem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.bianca.farmacia_do_bem.model.Categoria;


public interface CategoriaRepository extends JpaRepository <Categoria, Long>{
	
	List<Categoria> findAllByTipoContainingIgnoreCase(String tipo);

}
