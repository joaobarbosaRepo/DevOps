package teste;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import entidade.pizzaRecheio.Decorator.Bacon;
import entidade.pizzaRecheio.Decorator.Queijo;
import entidade.pizzamassa.Deco.Pizza;
import entidade.pizzamassa.Deco.PizzaDeluxe;
import entidade.pizzamassa.Deco.PizzaPadrao;
import exception.PizzaException;

public class PizzaTesteDecorator {
@Test
public void testavalorpizzaPadrao() {
Pizza pizzapadrao= new PizzaPadrao();
assertEquals(20,pizzapadrao.getValor());

}
@Test
public void testavalorpizzaDeluxe() {
Pizza pizzadeluxe= new PizzaDeluxe();
assertEquals(30,pizzadeluxe.getValor());
}
@Test
public void testavalorpizzaQueijo() {
Pizza pizzapadrao = new PizzaPadrao();
pizzapadrao= new Queijo(new Queijo(pizzapadrao));
assertEquals(26,pizzapadrao.getValor());
 }

@Test
public void testavalorpizzaBacon() {
Pizza pizzadeluxe = new PizzaDeluxe();
pizzadeluxe= new Bacon(new Bacon(pizzadeluxe));
assertEquals(37,pizzadeluxe.getValor());

 }
@Test
public void testaMontarNitens() {
	Pizza pizzapadrao = new PizzaPadrao();
	pizzapadrao= new Queijo(new Queijo(new Bacon(new Bacon(pizzapadrao))));
	assertEquals(33,pizzapadrao.getValor());
	 }	

@Test
public void testaExceptionPizza() {

PizzaException thrown = assertThrows(PizzaException.class, () -> {
	   Queijo queijo = new Queijo(null);
		});
		assertEquals("Não existe pizza sem recheio", thrown.getMessage());
}
}


