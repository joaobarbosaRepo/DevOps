package teste;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import command.Deposito;
import command.Saque;
import command.Solicitacao;


public class CommandTest {
@Test
public void commandTesteIntanceofDeposito() {
	Solicitacao sl = new Deposito(5);
	assertTrue(sl instanceof Deposito);
 }
@Test
public void commandTesteIntanceofSaque() {
	Solicitacao sl = new Saque(3);
	assertTrue(sl instanceof Saque);
 }
@Test
public void valorSaqueTeste() {
	Solicitacao sl = new Saque(50);
	assertEquals(-50,sl.solicitar());

}
@Test
public void valorDepositoTeste() {
	Solicitacao sl = new Deposito(50);
	assertEquals(50,sl.solicitar());
}

}

