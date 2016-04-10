package br.com.mercado.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(generator="geradorCliente", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="geradorCliente", sequenceName="cliente_seq", allocationSize=1, initialValue=1)
	private String email;
	
	private String nome;
	
	private String senha;
	
	@OneToMany
	private List<Pedido> pedidos;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
