package br.com.mercado.modelo;

import javax.persistence.Query;



public class ClienteDao extends Persistencia<Cliente>{

	public ClienteDao(){
		super(Cliente.class);
	}

	public void incluir(Cliente c) throws MercadoException{
		Cliente cliente = this.Consultar(c.getEmail());
		if(cliente == null){
			this.incluir(c);
		}else{
			throw new MercadoException("Cliente já cadastrado");
		}
	}
	
	public Cliente autenticar(String email, String senha) throws Exception{
		try{
			Query query = this.em.createQuery(""
					+ "SELECT * FROM cliente c WHERE c.email = :email"
					+ "AND c.senha = :senha");
			query.setParameter("email", email);
			query.setParameter("senha", senha);
			
			return (Cliente) query.getSingleResult();
		}catch(Exception e){
			throw new Exception("Não foi possível autenticar.");
		}
	}
}
