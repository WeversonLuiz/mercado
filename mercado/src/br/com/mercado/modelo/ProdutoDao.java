package br.com.mercado.modelo;

import java.util.List;

import javax.persistence.Query;

public class ProdutoDao extends Persistencia<Produto> {
	public ProdutoDao() {
		super(Produto.class);
	}

	public List<Produto> listarPorDescricao(String descricao) {
		Query query = this.em.createQuery(""
				+ "SELECT * FROM PRODUTO p "
				+ "WHERE p.descricao like :descricao");
		query.setParameter("descricao", "%"+descricao.toUpperCase()+"%");
		
		return query.getResultList();
	}
}
