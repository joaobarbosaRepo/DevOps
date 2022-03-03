package entidade.pizzaRecheio.Decorator;

import entidade.pizzamassa.Deco.Pizza;
import exception.PizzaException;

public abstract class RecheioDecorator implements Pizza {
   private Pizza pizza;
	public RecheioDecorator(Pizza pizza) {
		if(pizza!= null) {
		this.pizza= pizza;
		}
		else {throw new PizzaException("Não existe pizza sem recheio");}
	}
	@Override
	public double getValor() {
		return pizza.getValor();
	}
     

}
