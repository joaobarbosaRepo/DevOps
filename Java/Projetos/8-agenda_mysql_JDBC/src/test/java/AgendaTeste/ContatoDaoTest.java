package AgendaTeste;

import org.junit.Test;

import dao.ContatoDao;
import entidade.Contato;

public class ContatoDaoTest {

	public void agendaopTest() {
		ContatoDao contatodao = new ContatoDao();
		Contato contato15 = new Contato("Jubileu", "224477", "Jubileu@bool");
		contatodao.salvar(contato15); // Adicionando contato ao banco de dados
		Contato contato43 = new Contato("jurandir", "225588", "Jessica@google");
		contatodao.salvar(contato43); // Adicionando segundo contato ao banco de dados
		System.out.println("**Listar contatos**");
		for (Contato cont : contatodao.getContatos()) { // Exibindo a lista de contatos salva no banco
			System.out.println(cont);
		}
		System.out.println("Pesquisando por nome:"); // Pesquisando por nome contato
		System.out.println(contatodao.pesquisaPnome("jurandir"));

		contatodao.deletaPid(4); // Deletando por ID o id está como auto increment então o número do id
		contatodao.deletaPid(5); // pode estar diferente

		System.out.println("**Listar contatos**");
		for (Contato cont : contatodao.getContatos()) {
			System.out.println(cont);

		}

	}

	@Test
	public void cadastraReptida() {

		ContatoDao contatodao = new ContatoDao();
		Contato contato45 = new Contato("Pedro", "225566", "pedro@bool"); // Testa cadastrar contato repetido.
		contatodao.salvar(contato45);
		Contato contato46 = new Contato("Pedro", "225566", "pedro@bool");
		contatodao.salvar(contato46);
	}

}
