package entidade;

public class Comanda {
     private int quantidade;
	 private double preco;
	 Produto produto;
      
	 public Comanda(int quantidade, double preco, Produto produto) {
		super();
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Comanda() {
		
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	 public double subTotal() {
	 
	    return preco * quantidade;
}
	@Override
	public String toString() {
		return produto.getName()+ ", $"+ preco+ ", Quantidade: "+quantidade+" subtotal: $"+subTotal();
	}
	 
}
