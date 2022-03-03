package tema07_1;

import java.util.HashMap;

public class Inteiro {
  private int x;
  static HashMap convertromano;

public Inteiro(int x) {
	
	this.x = x;
}
public Inteiro() {
  convertromano = new HashMap<Integer,String>();
    convertromano.put(1,"I");
    convertromano.put(2, "II");
	convertromano.put(3,"III");
	convertromano.put(4,"IV");
	convertromano.put(5,"V");
	convertromano.put(6,"VI");
	convertromano.put(7,"VII");
	convertromano.put(8,"VIII");
	convertromano.put(9,"IX");
	convertromano.put(10,"X");
	convertromano.put(11,"XI");
	convertromano.put(12,"XII");
	convertromano.put(13,"XIII");
	convertromano.put(14,"XIV");
	convertromano.put(15,"XV");
	convertromano.put(16,"XVI");
	convertromano.put(17,"XVII");
	convertromano.put(18,"XVIII");
	convertromano.put(19,"XIX");
	convertromano.put(20,"XX");

}


public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}
public static boolean convertRomano(int x) {
	boolean y= true;   
	String r;
	if (convertromano.containsKey(x)) {
	r= (String) convertromano.get(x);
	System.out.println("VALOR EM ROMANOS="+ r);
	                                  }
	else {
		System.out.println("*** NÃO É UM NUMERO INTEIRO DE 1 ATÉ 20!!***");
	     y= false;
	     }
	
	
	return y;
                                            }


}
