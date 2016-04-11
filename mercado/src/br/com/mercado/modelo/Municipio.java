package br.com.mercado.modelo;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Municipio {
	
	@Id
	@GeneratedValue(generator="municipio_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="municipio_seq", sequenceName="municipio_seq", allocationSize=1, initialValue=1)
	private Integer id;
	
	private String descricao;
	
	@Enumerated
	private Uf uf;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Uf getUf() {
		return uf;
	}
	public void setUf(Uf uf) {
		this.uf = uf;
	}

}
