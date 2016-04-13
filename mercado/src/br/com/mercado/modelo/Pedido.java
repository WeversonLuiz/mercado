package br.com.mercado.modelo;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.richfaces.iterator.ForEachIterator;

@Entity
public class Pedido {
	
	@Id
	@GeneratedValue(generator="pedido_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="pedido_seq", sequenceName="pedido_seq", allocationSize=1, initialValue=1)
	private Integer id;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date data;
	
	@ManyToOne
	private Cliente cliente;
	
	@OneToMany
	private List<ItemPedido> itens;
	
	public void adicionarProduto(Produto produto){
		ItemPedido novoItem = new ItemPedido(produto, this);
		if(itens.contains(novoItem)){
			ItemPedido itemPedido = itens.get(itens.indexOf(novoItem));
			itemPedido.setQuantidade(itemPedido.getQuantidade() + 1);
		}else{
			itens.add(novoItem);
		}
	}
	
	public void removerItem(ItemPedido itemPedido){
		itens.remove(itemPedido);
	}
	
	public double getPrecoTotal(){
		double valorTotalPedido = 0;
		for (ItemPedido itemPedido : itens) {
			valorTotalPedido += itemPedido.getTotal();
		}
		return valorTotalPedido;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<ItemPedido> getItens() {
		return itens;
	}
	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}
	
}
