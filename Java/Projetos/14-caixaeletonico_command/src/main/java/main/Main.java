package main;
import java.util.Scanner;
import Servico.CaixaEletronico;
import command.Solicitacao;
public class Main {

	public static void main(String[] args) {
		CaixaEletronico caixa= new CaixaEletronico();
		Scanner sc= new Scanner(System.in);
		int menu;
		do {
		     exibirmenu();                                                                                
			 menu=sc.nextInt();                                             
			  switch(menu){
			    case 1:
			    	System.out.println("Entre com valor para de deposito:");
		            double deposito = sc.nextDouble(); 
		             caixa.realizarDeposito(deposito);
		             break;                        
			        case 2 :
				      System.out.println("Entre com valor para sacar da conta");
				      double saque = sc.nextInt();
				      caixa.realizaSaque( saque);
			          break;
			          
			            case 3 :
			                System.out.println("Extrato:");    
				            for(Solicitacao c:caixa.getSolicitacao()) {
					          System.out.println(c);
				              }
				            break; 
		                        
			                }
		   }while(menu!=4);
		sc.close();
		  }
		
		static void exibirmenu() {
			System.out.println("********Caixa Banco do Brasil**********");
			System.out.println("1--Depositar:");
			System.out.println("2--Saque");
			System.out.println("3--Extrato");
			System.out.println("4--Sair");
		
		}	
}
