package tema07_1;

import java.util.HashMap;

public class Romanos {
 private String x;
 static HashMap converinteiro;
public Romanos(String x) {
	
	this.x= x;
}
public Romanos() {
	converinteiro= new HashMap<String,Integer>();
	converinteiro.put("I", 1);
	converinteiro.put("II", 2);
	converinteiro.put("III", 3);
	converinteiro.put("IV", 4);
	converinteiro.put("V", 5);
	converinteiro.put("VI", 6);
	converinteiro.put("VII", 7);
	converinteiro.put("VIII", 8);
	converinteiro.put("IX", 9);
	converinteiro.put("X", 10);
	converinteiro.put("XI", 11);
	converinteiro.put("XII", 12);
	converinteiro.put("XIII", 13);
	converinteiro.put("XIV", 14);
	converinteiro.put("XV", 15);
	converinteiro.put("XVI", 16);
	converinteiro.put("XVII", 17);
	converinteiro.put("XVII", 18);
	converinteiro.put("XIX", 19);
	converinteiro.put("XX", 20);
}
public String getN() {
	return x;
}
public void setN(String x) {
	this.x = x;
}
public static boolean converInteiro(String x) {
	boolean y= true;
	int i;

	if (converinteiro.containsKey(x)) {
	i=  (int) converinteiro.get(x);
	System.out.println("VALOR EM ROMANOS="+ i);
	}
	else  {System.out.println("NÃO É UM NÚMERO ROMANO OU NÚMERO ROMANO MAIOR QUE XX.");
	 y=false;
	}
	
	return y;
}

}
