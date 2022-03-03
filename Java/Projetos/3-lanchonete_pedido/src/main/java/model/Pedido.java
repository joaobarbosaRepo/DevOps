package model;

public class Pedido {
    private int idpedido;
    private String pedido;
    private double preco;
     Cliente cliente;
    public Pedido(){

    }

    public Cliente getCliente() {
        return cliente;
    }

    public Pedido(int idpedido, String pedido, double preco, Cliente cliente) {
        this.idpedido = idpedido;
        this.pedido = pedido;
        this.preco = preco;
        this.cliente= cliente;
    }

    public int getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "idpedido=" + idpedido +
                ", pedido=" + pedido  +
                ", preco=" + preco +
                '}';
    }
}
