package br.com.mercado.modelo;

import javax.persistence.EntityManager;

import br.com.mercado.util.ConexaoJpa;

public class Persistencia <E>{

	private Class<E> classe;
	protected EntityManager em;
	
	public Persistencia (Class <E> classe){
		this.classe = classe;
		em = ConexaoJpa.criarEntityManager();
	}
	
	public void abrirTransacao(){
		em.getTransaction().begin();
	}
	
	public void fecharTransacao(){
		em.close();
	}
	
	public void commit(){
		em.getTransaction().commit();
	}
	
	public void rollback(){
		em.getTransaction().rollback();
	}
	
	public void incluir(E model) throws Exception{
		try{
			this.abrirTransacao();
			em.persist(model);
			this.commit();
			
		}catch(Exception e){
			this.rollback();
			throw new Exception("Não foi possível incluir");
		}finally{
			this.fecharTransacao();
		}
	}
	
	public void excluir(Object id)throws MercadoException{
		try{
			this.abrirTransacao();
			E model = em.find(classe, id);
			em.remove(model);
			this.commit();
		}catch(Exception e){
			this.rollback();
			throw new MercadoException("Não foi possível excluir");
		}finally{
			this.fecharTransacao();
		}
	}
	
	public E alterar(Object id)throws Exception{
		try{
			this.abrirTransacao();
			E model = em.find(classe, id);
			em.merge(model);
			this.commit();
			return model;
		}catch(Exception e){
			this.rollback();
			throw new Exception("Não foi possível fazer a alteração");
		}finally{
			this.fecharTransacao();
		}
	}
	
	public E Consultar(Object id)throws MercadoException{
		try{
			this.abrirTransacao();
			return em.find(classe, id);
		}catch(Exception e){
			throw new MercadoException("Erro ao realizar consulta");
		}finally{
			this.fecharTransacao();
		}
	}
}
