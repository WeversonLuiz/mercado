package br.com.mercado.controle;

import br.com.mercado.modelo.Produto;

public class PedidoControl {
	
	private Produto produto = new Produto();

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}
