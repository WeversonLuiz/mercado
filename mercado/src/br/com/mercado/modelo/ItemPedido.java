package br.com.mercado.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class ItemPedido {
	
	@Id
	@GeneratedValue(generator="itemPedido_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="itemPedido_seq", sequenceName="itemPedido_seq", allocationSize=1, initialValue=1)
	private Integer id;
	
	private int quantidade;
	
	@ManyToOne
	private Pedido pedido;
	@ManyToOne
	private Produto produto;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}

}
