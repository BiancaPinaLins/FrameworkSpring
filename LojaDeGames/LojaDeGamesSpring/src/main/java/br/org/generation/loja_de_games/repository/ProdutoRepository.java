package br.org.generation.loja_de_games.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.loja_de_games.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository <Produto, Long>{

	
	public List <Produto> findAllByNomeContainingIgnoreCase (String nome);
	
	public List <Produto> findByPrecoGreaterThanOrderByPreco (BigDecimal preco);
	
	public List <Produto> findByPrecoLessThanOrderByPreco (BigDecimal preco);

}
