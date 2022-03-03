package main;

import java.text.ParseException;
import entidade.Cliente;
import entidade.Livro;
import servico.Clienteservico;
import servico.Emprestimoservico;
import servico.Livroservico;

public class Livraria {

    public static void main(String[] args) throws ParseException {


        Livroservico livros=new Livroservico();
        Livro livro1= new Livro(1,"one piece","Oda");
        Livro livro2= new Livro(2,"Berserk","miura");
        Livro livro3= new Livro(3, "Naruto", "kishimoto");
        Livro livro4= new Livro(4, "kimetsu no yaiba","Koyoharu");
        Livro livro5= new Livro(5,"HunterxHunter","Togashi");
        Livro livro6= new Livro(6,"Mutantes","RecordTV");
        Livro livro7= new Livro (7,"Vingadores","Stan Lee") ;
        Livro livro8= new Livro (8,"O senhor dos aneis","J. R. R. Tolkien ");
        Livro livro9= new Livro(9, "Batman","Bob Kane");
        Livro livro10=  new Livro(10,"x-Men","Stan Lee");
        livros.addLivro(livro1);
        livros.addLivro(livro2);
        livros.addLivro(livro3);
        livros.addLivro(livro4);
        livros.addLivro(livro5);
        livros.addLivro(livro6);
        livros.addLivro(livro7);
        livros.addLivro(livro8);
        livros.addLivro(livro9);
        livros.addLivro(livro10);

        System.out.println("***Opção Listar livros:***");
        livros.listarLivros();
        System.out.println("--------------------------");
        System.out.println("***Remover o livro id escolhida ***");
        livros.removeLivro(1);
        System.out.println("--------------------------");
        System.out.println("***Opção Listar livros:***");
        livros.listarLivros();
        System.out.println("--------------------------");
        livros.pesquisAutor("miura");
        System.out.println("--------------------------");
        livros.pesquisaTitulo("Kimetsu no yaiba");
        System.out.println("--------------------------");

        Clienteservico clientes= new Clienteservico();
        Cliente cliente1= new Cliente(1,"joao");
        Cliente cliente2= new Cliente(2,"jurandir");
        Cliente cliente3= new Cliente(3,"jabinelson");
        Cliente cliente4= new Cliente(4,"jaqtelson");
        Cliente cliente5= new Cliente(5,"jubitinga");

        clientes.addCliente(cliente1);
        clientes.addCliente(cliente2);
        clientes.addCliente(cliente3);
        clientes.addCliente(cliente4);
        clientes.addCliente(cliente5);
        clientes.listaCliente();
        System.out.println("---------------------------------------");

        System.out.println("Entre com livro e cliente para relizar o emprestimo:");
        Emprestimoservico emprestimos= new Emprestimoservico();
        emprestimos.pegarEmprestimo(livro4, cliente4,2021,12,13);
        emprestimos.pegarEmprestimo(livro3, cliente4,2021,12,20);
        emprestimos.pegarEmprestimo(livro2, cliente4,2021,12,15);
        emprestimos.pegarEmprestimo(livro7, cliente4, 2021, 12, 27);
        emprestimos.pegarEmprestimo(livro5, cliente2, 2021, 12, 19);
        emprestimos.pegarEmprestimo(livro6, cliente2, 2021, 12, 27);
        emprestimos.pegarEmprestimo(livro8, cliente3, 2021, 12, 27);
        emprestimos.pegarEmprestimo(livro9, cliente3, 2021, 12, 27);
        emprestimos.pegarEmprestimo(livro10, cliente5, 2021, 12, 27);
        emprestimos.listarEmpres();
        System.out.println("------------------------------------------");
        System.out.println("Entre com id livro para devolver:");
        emprestimos.devolvelivro(4);
        System.out.println("--------------------------");
        System.out.println("Entre com sua id livro e id do cliente para renovar:");
        emprestimos.renovaLivro(3, 4);
        System.out.println("--------------------------");
        System.out.println("Entre com livro e usuario para relizar o emprestimo:");
        emprestimos.pegarEmprestimo(livro3, cliente5,2021,12,24);
        System.out.println("--------------------------");
        System.out.println("Exibir lista de atrasados");
        emprestimos.listarAtrados();
        System.out.println("--------------------------");
        System.out.println(clientes.top10usuarios());

    }

}
