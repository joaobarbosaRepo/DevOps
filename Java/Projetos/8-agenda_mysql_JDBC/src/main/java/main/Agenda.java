package main;

import dao.ContatoDao;
import entidade.Contato;

public class Agenda {

	public static void main(String[] args) {

		ContatoDao contatodao = new ContatoDao();
		System.out.println("**Agenda de Contatos**");

		Contato contato1 = new Contato("JOAO", "224479", "JOAOSOUSA");
		contatodao.salvar(contato1);
		Contato contato2 = new Contato("Julia", "225588", "JULIASOARES@OI");
		contatodao.salvar(contato2);
		Contato contato3 = new Contato("JAQUELINE", "224477", "JOAOSOUSA");
		contatodao.salvar(contato3);
		System.out.println("**Listar contatos**");
		for (Contato cont : contatodao.getContatos()) {
			System.out.println(cont);
		}
		contatodao.deletaPid(3);

		System.out.println("**Listar contatos**");
		for (Contato cont : contatodao.getContatos()) {
			System.out.println(cont);

		}

		System.out.println("*** ATULIZAR CADASTRO***");
		Contato contatop = contatodao.pesquisaPnumero("224479");
		contatop.setNome("JOAO SOUSA");
		contatop.setEmail("joao@bool");
		contatop.setNumero("224479");

		contatodao.atualizaCadastro(contatop);

		System.out.println("**Listar contatos**");
		for (Contato cont : contatodao.getContatos()) {
			System.out.println(cont);

		}
		System.out.println("**Pesquisa por nome**");
		System.out.println(contatodao.pesquisaPnome("JOAO SOUSA"));

	}

}
