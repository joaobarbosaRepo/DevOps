package entidade.pizzaRecheio.Decorator;

import entidade.pizzamassa.Deco.Pizza;

public class Queijo extends RecheioDecorator {

 public Queijo(Pizza pizza) {
		super(pizza);
		
	}
@Override
public double getValor() {
	
	return super.getValor() + 3;
}




}
