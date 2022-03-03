package teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.Cafe;
import main.CafecomLeite;
import main.Cafeina;

public class CafeinaTeste {
	@Test
	public void testeCafe() {
		Cafeina cf = new Cafe();
		assertTrue(cf instanceof Cafe);
	}

	@Test
	public void testeCafeComLeite() {
		Cafeina cf = new CafecomLeite();
		assertTrue(cf instanceof CafecomLeite);
	}

	@Test
	public void finalizaBebidaTesteCafe() {
		Cafeina cf = new Cafe();
		assertTrue(cf.finalizaBebida()); // Metodo finalizaBebida de café retorna verdadeiro.
	}

	public void finalizaBebidaTesteCafecomLeite() {
		Cafeina cf = new CafecomLeite();
		assertFalse(cf.finalizaBebida()); // Metodo finalizaBebida de café com leite retorna falso.
	}
}
