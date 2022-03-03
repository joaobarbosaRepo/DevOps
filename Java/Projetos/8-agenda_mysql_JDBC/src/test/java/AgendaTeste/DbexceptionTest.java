package AgendaTeste;

import org.junit.Test;

import dao.ContatoDao;
import entidade.Contato;

public class DbexceptionTest {
@Test
public void deletaIdTest() {
	ContatoDao  contatodao = new ContatoDao();
	contatodao.deletaPid(3);             //Tentando deletar uma id que já foi deletada.
	contatodao.deletaPid(14);           // Deletando id que ainda não foi deletada.
	for (Contato cont : contatodao.getContatos()) {   //Testes ok
		System.out.println(cont);
	}	
}
@Test
public void pesquisaNomeTest() {
	ContatoDao  contatodao = new ContatoDao();
	System.out.println(contatodao.pesquisaPnome("silvana"));  //Exibir contato que não existe.
	System.out.println(contatodao.pesquisaPnome("Pedro"));   //Exibir contato que existe.	
	                                                         //Testes ok
}
@Test
public void pesquisaNumeroTest() {
	ContatoDao  contatodao = new ContatoDao();
	System.out.println(contatodao.pesquisaPnumero("99999"));  //Exibir contato que não existe.
	System.out.println(contatodao.pesquisaPnome("225566"));   //Exibir contato que existe.	
}                                                            //Testes ok

}
