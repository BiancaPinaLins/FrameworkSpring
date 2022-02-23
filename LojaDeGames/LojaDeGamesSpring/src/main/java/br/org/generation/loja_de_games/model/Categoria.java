package br.org.generation.loja_de_games.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categorias") 
public class Categoria {

	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment
	private Long id;
	
	@Size(min = 3, max = 100, message = "A marca deve conter no mínio 3 caracteres e no máximo 100 caracteres")
	@NotNull(message = "A marca do vídeo game é obrigatório")
	private String marca;
	
	@NotNull(message = "O tipo do vídeo game é obrigatório")
	private String tipo;
	
	@NotNull(message = "A garantia é um campo obrigatório")
	private String garantia;
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<Produto> produto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getGarantia() {
		return garantia;
	}

	public void setGarantia(String garantia) {
		this.garantia = garantia;
	}


}
