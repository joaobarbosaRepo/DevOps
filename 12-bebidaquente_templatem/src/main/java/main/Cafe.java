package main;

public class Cafe extends Cafeina {

	@Override
	public void ferveAgua() {
	System.out.println("COME�ANDO PREPARA��O DO CAF�");
	  System.out.println("---Ferve �gua---");
		System.out.println("1- Pega Bule");
		 System.out.println("2-Liga torneira");
		   System.out.println("3-Adiciona �gua no bule");
		    System.out.println("4-Desliga torneira");
		      System.out.println("5-Liga Boca do fog�o");
		        System.out.println("6-Coloca bule na boca Ligada do fog�o");
		
	}

	@Override
	public void colocaCafenoCoador() {
	System.out.println("---Prepara Coador---");
	    System.out.println("1-Pega colher");    
	       System.out.println("2-Pega coador");  
	         System.out.println("3- Pega caf�");
	           System.out.println("4-Encher coador com 2 colheres de caf�");
		          
	}

	@Override
	public void adicionaAguaFervidaAoCoador() {
	System.out.println("---�gua ferveu---");
	  System.out.println("1-Desliga Boca do fog�o");
		  System.out.println("2-Joga �gua do bule no coador");
	}

	@Override
	public boolean finalizaBebida() {
		System.out.println("---Finalizando bebida---");
		 System.out.println("1-Caf� est� pronto");
		   System.out.println("----------------------------");
		     return true;
		
	}

}
