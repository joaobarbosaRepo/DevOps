package testes;

import entidade.Cliente;
import entidade.Livro;
import org.junit.jupiter.api.Test;
import servico.Clienteservico;
import servico.Emprestimoservico;
import servico.Livroservico;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClienteTestes {
    @Test
    public void pesquisaClienteTest() {
        Clienteservico clientes= new Clienteservico();
        Cliente cliente1= new Cliente(1,"joao");
        clientes.addCliente(cliente1);
        assertTrue(clientes.pesquisaNome("joao"));
    }

    @Test
    public void contadorLiClienteTest() {
        Livroservico livros=new Livroservico();
        Livro livro1= new Livro(1,"one piece","Oda");
        Livro livro2= new Livro(2,"Berserk","miura");
        Livro livro3= new Livro(3, "Naruto", "kishimoto");
        Livro livro4= new Livro(4, "kimetsu no yaiba","Koyoharu");
        Livro livro5= new Livro(5,"HunterxHunter","Togashi");
        Livro livro6= new Livro(6,"Mutantes","RecordTV");
        Livro livro10= new Livro(10,"GOT","George");
        Livro livro11= new Livro(11,"Star Wars","joao");
        livros.addLivro(livro1);
        livros.addLivro(livro2);
        livros.addLivro(livro3);
        livros.addLivro(livro4);
        livros.addLivro(livro5);
        livros.addLivro(livro6);
        livros.addLivro(livro10);
        livros.addLivro(livro11);
        Clienteservico clientes= new Clienteservico();
        Cliente cliente1= new Cliente(1,"joao");
        clientes.addCliente(cliente1);

        Emprestimoservico emprestimos= new Emprestimoservico();
        assertTrue(emprestimos.pegarEmprestimo(livro1, cliente1, 2021, 10, 14));
        assertTrue(emprestimos.pegarEmprestimo(livro2, cliente1, 2021, 10, 14));
        assertTrue(emprestimos.pegarEmprestimo(livro3, cliente1, 2021, 10, 14));
        assertTrue(emprestimos.pegarEmprestimo(livro4, cliente1, 2021, 10, 14));
        assertTrue(emprestimos.pegarEmprestimo(livro5, cliente1, 2021, 10, 14));
        assertTrue(clientes.contadorLivro(1));                                    // Criado um metodo para testar se o contador de livros que estão emprestados
        emprestimos.devolvelivro(4);                                      // está funcionando, foi testado 2 cenarios e o resultado foi correto 5 livros e
        assertTrue(clientes.contadorLivro(1));                                    // 4 livros no segundo pq foi devolvido o livro id número 4

        assertTrue(clientes.contadoremprestimo(1));                   //Criando um metodo para testar se o contador de emprestimos no geral está funcionando
                                                                   //retornado o valor correto de emprestimos no teste VALOR= 5
                                                                      // tests oK
    }
    @Test
    public void testaTop10(){
        Livroservico livros=new Livroservico();
        Livro livro1= new Livro(1,"one piece","Oda");
        Livro livro2= new Livro(2,"Berserk","miura");
        Livro livro3= new Livro(3, "Naruto", "kishimoto");
        Livro livro4= new Livro(4, "kimetsu no yaiba","Koyoharu");
        Livro livro5= new Livro(5,"HunterxHunter","Togashi");
        Livro livro6= new Livro(6,"Mutantes","RecordTV");
        Livro livro10= new Livro(10,"GOT","George");
        Livro livro11= new Livro(11,"Star Wars","joao");
        livros.addLivro(livro1);
        livros.addLivro(livro2);
        livros.addLivro(livro3);
        livros.addLivro(livro4);
        livros.addLivro(livro5);
        livros.addLivro(livro6);
        livros.addLivro(livro10);
        livros.addLivro(livro11);

        Clienteservico clientes= new Clienteservico();
        Cliente cliente1= new Cliente(1,"joao");
        Cliente cliente2= new Cliente(2,"julio");
        Cliente cliente3= new Cliente(3,"jabilebson");
        Cliente cliente4= new Cliente(4,"jurandir");
        Cliente cliente5= new Cliente(5,"jax");
        Cliente cliente6= new Cliente(6,"Jabicreudo");
        Cliente cliente7= new Cliente(7,"Jaqson5");
        Cliente cliente8= new Cliente(8,"Jurandir");
        Cliente cliente9= new Cliente(9,"Julio");
        Cliente cliente10= new Cliente(10,"Jynx");
        Cliente cliente11= new Cliente(11,"Jubileu");
        clientes.addCliente(cliente1);
        clientes.addCliente(cliente2);
        clientes.addCliente(cliente3);
        clientes.addCliente(cliente4);
        clientes.addCliente(cliente5);
        clientes.addCliente(cliente6);
        clientes.addCliente(cliente7);
        clientes.addCliente(cliente8);
        clientes.addCliente(cliente9);
        clientes.addCliente(cliente10);
        clientes.addCliente(cliente11);

        Emprestimoservico emprestimos= new Emprestimoservico();
        assertTrue(emprestimos.pegarEmprestimo(livro1, cliente1, 2021, 10, 14));
        assertTrue(emprestimos.pegarEmprestimo(livro2, cliente1, 2021, 10, 14));
        assertTrue(emprestimos.pegarEmprestimo(livro3, cliente1, 2021, 10, 14));
        assertTrue(emprestimos.pegarEmprestimo(livro4, cliente2, 2021, 10, 14));
        assertTrue(emprestimos.pegarEmprestimo(livro5, cliente2, 2021, 10, 14));
        assertTrue(emprestimos.pegarEmprestimo(livro6, cliente3, 2021, 10, 14));
        assertTrue(emprestimos.pegarEmprestimo(livro10, cliente10, 2021, 10, 14));
        assertTrue(emprestimos.pegarEmprestimo(livro11, cliente11, 2021, 10, 14));
                                                                                               //teste foi mostrado  top 10 ranking dos usuarios que mais alugam livros
        System.out.println(clientes.top10usuarios());                                         // tests OK
    }
}
