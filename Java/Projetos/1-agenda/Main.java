package com.joaobilegra.core.tema06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int menu;
		String nome,numero;
		int id;
		
		Listagenda listagenda=new Listagenda();
	    Contato contato;
		do {
		    exibirmenu();                                                                                
			menu=sc.nextInt();                                             
			  switch(menu){
			  case 1:
				System.out.println("ENTRE COM NOME PARA ADD:");   
				sc.nextLine();
				nome=sc.nextLine();                                      
				System.out.println("ENTRE COM ID PARA ADD:");
				id=sc.nextInt();                                        
				System.out.println("ENTRE COM CONTATO PARA ADD:");
				numero=sc.next();                                      
				contato= new Contato(nome,id,numero);                         //NOVO CONTATO
				listagenda.adicionar(contato);                                // ADICIONA NOVO CONTATO EM ARRAYLIST
				                                                     
				
			  break;
			  case 2 :
				for(Contato f:Listagenda.getListagenda()) {                                                                  
					System.out.println(f);                            //MOSTRA ARRAY LIST
				 }
				
			  break;
			  case 3 :
			   System.out.println("entre com ID para REMOVER:");
			   id=sc.nextInt(); 
			   listagenda.remover(id);                               //REMOVE CONTATO POR ID, ID IVALIDO=" ID NÃO EXISTE"
			  break;
			  case 4 :
				System.out.println("ENTRE COM NOME PESQUISAR:");
				nome=sc.next();
				listagenda.pesquisarN(nome);                         //PESQUISA POR NOME, NOME IVALIDO ="CONTATO NÃO ENCONTRADO"
				break;                                                         
			case 5 :
				System.out.println("ENTRE COM ID PARA PESQUISAR: ");
				id=sc.nextInt();
				listagenda.pesquisarI(id);                              //PESQUISA POR ID, NOME IVALIDO ="CONTATO NÃO ENCONTRADO"    
				break;		
			}
			
			
			
		     }while(menu!=6);
		
		
		      sc.close();

	     }
static void exibirmenu() {
	System.out.println("********AGENDA DE CONTATO**********");
	System.out.println("1--CADASTRAR CONTATO:");
	System.out.println("2-- MOSTRAR LISTA");
	System.out.println("3--REMOVER LISTA");
	System.out.println("4--PESQUISAR NOME");
	System.out.println("5--PESQUISAR ID");
	System.out.println("6--SAIR");
		
		
	}

	}


