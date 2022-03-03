package entidade;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidadeenum.Statuspedido;

public class Pedido {
private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
private Date momento;
private Statuspedido status;
private Cliente cliente;
private List<Comanda>comanda= new ArrayList<>();
public Pedido() {
	
}
public Pedido(Date momento, Statuspedido status, Cliente cliente) {
	super();
	this.momento = momento;
	this.status = status;
	this.cliente = cliente;
}
public Date getMomento() {
	return momento;
}
public void setMomento(Date momento) {
	this.momento = momento;
}
public Statuspedido getStatus() {
	return status;
}
public void setStatus(Statuspedido status) {
	this.status = status;
}
public Cliente getCliente() {
	return cliente;
}
public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}
public List<Comanda> getComanda() {
	return comanda;
}
public void addItem(Comanda item) {
	comanda.add(item);
}
public void removeItem(Comanda item) {
	comanda.remove(item);
}
public double total() {
	double soma= 0;
	for(Comanda c: comanda) {
		soma= (soma+c.subTotal());
		
	}
	return soma;
}
@Override
public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append("Order moment: ");
	sb.append(sdf.format(momento) + "\n");
	sb.append("Order status: ");
	sb.append(status + "\n");
	sb.append("Client: ");
	sb.append(cliente + "\n");
	sb.append("Order items:\n");
	for (Comanda item : comanda) {
		sb.append(item + "\n");
	}
	sb.append("Total price: $");
	sb.append(String.format("%.2f", total()));
	return sb.toString();
}	



}
