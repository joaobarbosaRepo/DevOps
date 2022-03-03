package entidade.pizzaRecheio.Decorator;

import entidade.pizzamassa.Deco.Pizza;

public class Bacon extends RecheioDecorator {
   
	public Bacon(Pizza pizza) {
		super(pizza);
	}

	@Override
	public double getValor() {
	
		return super.getValor()+ 3.5;
	}
   
}
