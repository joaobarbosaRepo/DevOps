package service;

import model.Cliente;
import model.Pedido;

import java.util.ArrayList;
import java.util.List;

public class ClienteService {
    private Cliente cliente;
private List<Pedido> pedidos;

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public  ClienteService(){
    pedidos= new ArrayList<>();
}
public void buscaporid(int p){
        for(int i=0;i<pedidos.size();i++){
            if(pedidos.get(i).getCliente().getId_cliente()==p){
                System.out.println(pedidos.get(i));
            }
        }
}

public void addpedido(Cliente c,Pedido p){
    pedidos.add(p);
}
public void removepedido(Pedido p){
    pedidos.remove(p);
}
public void relatorio(Cliente cliente){
            System.out.println("NOME CLIENTE:"+cliente.getNome());
            System.out.println("ID CLIENTE:"+cliente.getId_cliente());
            System.out.println("----- PEDIDOS DO CLIENTE----");
            buscaporid(cliente.getId_cliente());
            System.out.println("TOTAL PAGAR:"+ calculavalortotal(cliente.getId_cliente()));
            System.out.println("----------------------------------------------------------");
    }
 public double calculavalortotal(int p) {
    double total=0;
     for(int i=0;i<pedidos.size();i++){
         if(pedidos.get(i).getCliente().getId_cliente()==p){
             total+= pedidos.get(i).getPreco();
          }
         }
     return total;
     }


    @Override
    public String toString() {
        return "ClienteService{" +
                "pedidos=" + pedidos +
                '}';
    }
}
