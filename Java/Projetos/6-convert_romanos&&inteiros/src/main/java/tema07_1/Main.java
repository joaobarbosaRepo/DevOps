package tema07_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
      int x, menu;
      String y;
      Scanner sc= new Scanner(System.in);
      do {
    	  System.out.println("1-CONVERTE N�MERO INTEIRO EM ROMANO");
    	  System.out.println("2-CONVERTE N�MERO ROMANO EM INTEIRO");
    	  System.out.println("3- SAIR");
    	  menu=sc.nextInt();
    	  switch(menu) {
    	  case 1:
    		  System.out.println("ENTRE COM N�MERO INTEIRO:");
    		  x=sc.nextInt();
    		  Inteiro inteiro= new Inteiro();
    		  inteiro.convertRomano(x);
    		  break;
    	  case 2:
    		  System.out.println("ENTRE COM N�MERO ROMANO:");
    		  y= sc.next();
    		  Romanos romanos= new Romanos();
    		  y= y.toUpperCase();
    		  romanos.converInteiro(y);
    		  break;
    		 
    	  }
    	  
    	 }while(menu!=3);
          sc.close();
	}

	
	

}
