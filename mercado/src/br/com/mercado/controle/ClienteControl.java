package br.com.mercado.controle;

import br.com.mercado.modelo.Cliente;

public class ClienteControl {
	
	private Cliente cliente = new Cliente();
	
	private String email;
	private String senha;
	private String cepString;
	private boolean autenticado;
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getCepString() {
		return cepString;
	}
	public void setCepString(String cepString) {
		this.cepString = cepString;
	}
	public boolean isAutenticado() {
		return autenticado;
	}
	public void setAutenticado(boolean autenticado) {
		this.autenticado = autenticado;
	}
	
}
