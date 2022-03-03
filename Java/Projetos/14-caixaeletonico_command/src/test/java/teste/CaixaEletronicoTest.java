package teste;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import Servico.CaixaEletronico;
import exception.CaixaException;



public class CaixaEletronicoTest {
@Test	
public void testaCaixaEletronicoDeposito(){
	CaixaEletronico caixa= new CaixaEletronico();
	caixa.realizarDeposito(300);
	assertEquals(300,caixa.calculasaldo());
}
@Test
public void testaCaixaEletronicoSaque() {
	CaixaEletronico caixa= new CaixaEletronico();
	caixa.realizarDeposito(1000);
	caixa.realizaSaque( 300);
	assertEquals(700,caixa.calculasaldo());	
}

@Test
public void testaCaixaEletronicoSaqueException() {

	 CaixaException thrown = assertThrows(CaixaException.class, () -> {
		 CaixaEletronico caixa= new CaixaEletronico();
			caixa.realizarDeposito(50);
			caixa.realizaSaque(100);
			});
			assertEquals("Valor de saque não pode ser maior que o valor em conta", thrown.getMessage());
}
@Test
public void testaCaixaEletronicoDepositoException() {
	CaixaException thrown = assertThrows(CaixaException.class, () -> {
		 CaixaEletronico caixa= new CaixaEletronico();
			caixa.realizarDeposito(-50);
		
			});
			assertEquals("Valor não pode ser - ou = 0", thrown.getMessage());
}
}




