package br.com.mercado.controle;

import br.com.mercado.modelo.Cep;
import br.com.mercado.modelo.CepDao;
import br.com.mercado.modelo.Cliente;
import br.com.mercado.modelo.ClienteDao;
import br.com.mercado.modelo.MercadoException;
import br.com.mercado.util.Utilitario;

public class ClienteControl {
	
	private Cliente cliente = new Cliente();
	
	private String email;
	private String senha;
	private String cepString;
	private boolean autenticado;
	
	public String comfirmarCliente(){
		if (!senha.equals(cliente.getSenha())) {
			Utilitario.addMessagemFaces("As senhas devem ser iguais!!");
			return null;
		}
		ClienteDao clienteDao = new ClienteDao();
		try {
			clienteDao.alterar(cliente);
			Utilitario.addMessagemFaces("Confirmação realizada com sucesso");
			autenticado = true;
			return "confirmado";
		} catch (Exception e) {
			Utilitario.addMessagemFaces(e.getMessage());
			return null;
		}
		
	}
	
	public void consultarCep(String evt){
		CepDao cepDao = new CepDao();
		if (cepString != null) {
			try {
				Cep cep = cepDao.Consultar(cepString);
				cliente.setCep(cep);
			} catch (MercadoException e) {
				Utilitario.addMessagemFaces(e.getMessage());
			}
		}
	}
	
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
