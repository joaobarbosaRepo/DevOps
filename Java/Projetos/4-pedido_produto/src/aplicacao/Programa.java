package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidade.Cliente;
import entidade.Comanda;
import entidade.Pedido;
import entidade.Produto;
import entidadeenum.Statuspedido;

public class Programa {

	public static void main(String[] args) throws ParseException {
	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		Cliente cliente= new Cliente(name,email,birthDate);
		System.out.println("Entre com status do pedido");
		Statuspedido status=Statuspedido.valueOf(sc.next());
		Pedido pedido= new Pedido(new Date(),status,cliente);
		System.out.println("Quantos itens o pedido vai ter");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("ENTRE item #"+i);
			System.out.println("produto nome");
			String produtonome=sc.next();
			System.out.println("Preço do produto");
			double preco=sc.nextDouble();
			System.out.println("Quantidade produto");
			int quantidade=sc.nextInt();
			Produto produto= new Produto(produtonome,preco);
			Comanda comanda= new Comanda(quantidade,preco,produto);
			pedido.addItem(comanda);
		}
		System.out.println(pedido);
		sc.close();
}
}
