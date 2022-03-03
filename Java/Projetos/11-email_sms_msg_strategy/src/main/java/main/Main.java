package main;

import entidade.Cliente;
import servico.Notificacao;

public class Main {

	public static void main(String[] args) {
		 
		Cliente cliente1 = new Cliente("JULIA","julia@gmail",null);
        Notificacao notificacao= new Notificacao();
        System.out.println(notificacao.enviaNotificacao(cliente1));
        Cliente cliente2= new Cliente("JOAO",null,"2445566");
        System.out.println(notificacao.enviaNotificacao(cliente2));
        Cliente cliente3= new Cliente("JADSON","jadson@gmail.com","2445566");
        System.out.println(notificacao.enviaNotificacao(cliente3));
        Cliente cliente5= new Cliente("julio",null,null);
        System.out.println(notificacao.enviaNotificacao(cliente5));


	}

}
