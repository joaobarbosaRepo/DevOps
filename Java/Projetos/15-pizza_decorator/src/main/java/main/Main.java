package main;
import entidade.pizzaRecheio.Decorator.Bacon;
import entidade.pizzaRecheio.Decorator.Queijo;
import entidade.pizzamassa.Deco.Pizza;
import entidade.pizzamassa.Deco.PizzaDeluxe;
import entidade.pizzamassa.Deco.PizzaPadrao;

public class Main {

	public static void main(String[] args) {
		Pizza pizzapadrao= new PizzaPadrao();
		Pizza pizzacria= new Queijo(new Bacon(pizzapadrao));
		System.out.println("Valor total pizza: " +pizzacria.getValor());
		PizzaDeluxe pizzaDeluxe= new PizzaDeluxe();
		pizzacria= new Queijo(new Queijo(pizzaDeluxe));
		System.out.println("Valor total pizza: "+pizzacria.getValor());

	}

}
