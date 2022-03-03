package main;

public class CafecomLeite extends Cafeina {


	@Override
	public void ferveAgua() {
	System.out.println("COMEÇANDO PREPARAÇÃO DO CAFÉ COM LEITE");
	  System.out.println("---Ferve água---");
		System.out.println("1- Pega Bule");
		 System.out.println("2-Liga torneira");
		   System.out.println("3-Adiciona água no bule");
		    System.out.println("4-Desliga torneira");
		      System.out.println("5-Liga Boca do fogão");
		        System.out.println("6-Coloca bule na boca Ligada do fogão");
		
	}

	@Override
	public void colocaCafenoCoador() {
	System.out.println("---Prepara Coador---");
	    System.out.println("1-Pega colher");    
	       System.out.println("2-Pega coador");  
	         System.out.println("3- Pega café");
	           System.out.println("4-Encher coador com 2 colheres de café");
		          
	}

	@Override
	public void adicionaAguaFervidaAoCoador() {
	System.out.println("---Água ferveu---");
	  System.out.println("1-Desliga Boca do fogão");
		  System.out.println("2-Joga água do bule no coador");
	}

	@Override
	public boolean finalizaBebida() {
	System.out.println("---Finalizando bebida---");
	  System.out.println("1-Café está pronto");
		System.out.println("2-Pega leite");
		 System.out.println("3-Adiciona leite ao café");
		  System.out.println("4-O café com leite está pronto");
		    return false;
		
	}


}
