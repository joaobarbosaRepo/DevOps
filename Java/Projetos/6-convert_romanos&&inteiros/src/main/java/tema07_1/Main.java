package tema07_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
      int x, menu;
      String y;
      Scanner sc= new Scanner(System.in);
      do {
    	  System.out.println("1-CONVERTE NÚMERO INTEIRO EM ROMANO");
    	  System.out.println("2-CONVERTE NÚMERO ROMANO EM INTEIRO");
    	  System.out.println("3- SAIR");
    	  menu=sc.nextInt();
    	  switch(menu) {
    	  case 1:
    		  System.out.println("ENTRE COM NÚMERO INTEIRO:");
    		  x=sc.nextInt();
    		  Inteiro inteiro= new Inteiro();
    		  inteiro.convertRomano(x);
    		  break;
    	  case 2:
    		  System.out.println("ENTRE COM NÚMERO ROMANO:");
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
