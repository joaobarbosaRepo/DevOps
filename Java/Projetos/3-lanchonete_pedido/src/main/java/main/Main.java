package main;

import model.Cliente;
import model.Pedido;
import service.ClienteService;

public class Main {
    public static void main(String[] args) {
      Cliente cliente1= new Cliente(1,"joao");
        Cliente cliente2= new Cliente(2,"julia");
      Pedido pedido = new Pedido(01,"batata",15,cliente1);
      Pedido pedido2 = new Pedido(02,"pizza",25,cliente1);
      Pedido pedido3 = new Pedido(03,"pizza",25,cliente2);
      ClienteService clienteService= new ClienteService();
      clienteService.addpedido(cliente1,pedido);
      clienteService.addpedido(cliente1,pedido2);
      clienteService.addpedido(cliente2,pedido3);
      clienteService.relatorio(cliente1);
      clienteService.relatorio(cliente2);




    }


}
