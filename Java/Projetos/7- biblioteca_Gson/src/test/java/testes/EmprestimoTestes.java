package testes;

import entidade.Cliente;
import entidade.Livro;
import org.junit.jupiter.api.Test;
import servico.Clienteservico;
import servico.Emprestimoservico;
import servico.Livroservico;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmprestimoTestes {
    @Test
    public void pegarEmprestimoTest(){
    Livroservico livros=new Livroservico();
    Livro livro1= new Livro(1,"one piece","Oda");
    Livro livro2= new Livro(2,"Berserk","miura");
    Livro livro3= new Livro(3, "Naruto", "kishimoto");
    Livro livro4= new Livro(4, "kimetsu no yaiba","Koyoharu");
    Livro livro5= new Livro(5,"HunterxHunter","Togashi");
    Livro livro6= new Livro(6,"Mutantes","RecordTV");
	livros.addLivro(livro1);
	livros.addLivro(livro2);
	livros.addLivro(livro3);
	livros.addLivro(livro4);
	livros.addLivro(livro5);
	livros.addLivro(livro6);
    Cliente cliente1= new Cliente(1,"joao");
    Cliente cliente5= new Cliente(5,"jubitinga");
    Emprestimoservico emprestimos= new Emprestimoservico();
    assertTrue(emprestimos.pegarEmprestimo(livro6, cliente5, 2021, 12, 10));
    assertTrue(emprestimos.pegarEmprestimo(livro5, cliente5, 2021, 12, 10));
    assertTrue(emprestimos.pegarEmprestimo(livro4, cliente5, 2021, 12, 10));      //TESTANDO SE CLIENTE CONSEGUE PEGAR MAIS QUE 5 LIVROS
    assertTrue(emprestimos.pegarEmprestimo(livro3, cliente5, 2021, 12, 10));      //NO TESTE O LIVRO 01 FICOU DE FORA PQ SÓ É PERMITIDO PEGAR 5 LIVROS
    assertTrue(emprestimos.pegarEmprestimo(livro2, cliente5, 2021, 12, 10));
    assertTrue(emprestimos.pegarEmprestimo(livro1, cliente5, 2021, 12, 10));
	emprestimos.listarEmpres();
    assertTrue(emprestimos.pegarEmprestimo(livro5, cliente1, 2021, 12, 10));    //TENTANDO PEGAR UM LIVRO JÁ EMPRESTADO.
                                                                                            // O CLIENTE 1 NÃO CONSEGUIU PEGAR O LIVRO 5 PQ ELE JÁ ESTÁ EMPRESTADO	                                                                           // PARA O CLIENTE 05
}                                                                                            //tests ok

    @Test
    public void devolverLivroTest() {
        Livroservico livros=new Livroservico();
        Livro livro10= new Livro(10,"GOT","George");
        Livro livro11= new Livro(11,"Star Wars","joao");
        livros.addLivro(livro10);
        livros.addLivro(livro11);
        Clienteservico clientes= new Clienteservico();
        Cliente cliente1= new Cliente(15,"miranha");
        Cliente cliente2= new Cliente(2,"jurandir");
        clientes.addCliente(cliente1);
        clientes.addCliente(cliente2);
        Emprestimoservico emprestimos= new Emprestimoservico();
        assertTrue(emprestimos.pegarEmprestimo(livro10, cliente1, 2021, 12, 13));
        assertTrue(emprestimos.devolvelivro(10));                                              // Teste para Devolver o livro id 10 e pagar a multa de 35  reais devolvendo 27/12/2021
        assertTrue(emprestimos.pegarEmprestimo(livro10, cliente2, 2021, 12, 30));    //  Teste para pegar o livro de id 10 que estava emprestado para
        emprestimos.listarEmpres();                                                               // O cliente 1 no teste foi possivel
        assertTrue(emprestimos.pegarEmprestimo(livro11, cliente2, 2021, 12, 29));
        emprestimos.devolvelivro(11);                                                            // Testando devolver livro sem multa
        assertTrue(emprestimos.pegarEmprestimo(livro11, cliente1, 2021, 12, 30));    // Testando se conseguimos pegar o livro devolvido
        emprestimos.listarEmpres();                                                               // tests ok

    }

    @Test
    public void renovaLivroTest() {
        Livroservico livros=new Livroservico();
        Livro livro12= new Livro (12,"Vingadores","Stan Lee") ;
        Livro livro13= new Livro (13,"O senhor dos aneis","J. R. R. Tolkien ") ;
        livros.addLivro(livro12);
        livros.addLivro(livro13);
        Cliente cliente24= new Cliente(36,"Rugal");
        Emprestimoservico emprestimos= new Emprestimoservico();
        assertTrue(emprestimos.pegarEmprestimo(livro12, cliente24, 2021, 12, 13));
        assertTrue(emprestimos.renovaLivro(12, 36));                                    //Testado se o metodo renovaLivro está funcionando corretamente quando
        emprestimos.listarEmpres();                                                             // cliente tem dias de atraso e se atualiza o horario  corretamente
        assertTrue(emprestimos.pegarEmprestimo(livro13, cliente24, 2021, 12, 29));
        assertTrue(emprestimos.renovaLivro(13, 36));                                       //Testando renovar emprestimo com cliente entregando em dia
        emprestimos.listarEmpres();                                                                 //tests ok


    }

    @Test
    public void relatotioAtrasado() {
        Livroservico livros=new Livroservico();
        Livro livro12= new Livro (12,"Vingadores","Stan Lee") ;
        Livro livro13= new Livro (13,"O senhor dos aneis","J. R. R. Tolkien ") ;
        livros.addLivro(livro12);
        livros.addLivro(livro13);
        Cliente cliente24= new Cliente(36,"Rugal");
        Cliente cliente25= new Cliente(37,"Romulo");
        Emprestimoservico emprestimos= new Emprestimoservico();
        assertTrue(emprestimos.pegarEmprestimo(livro12, cliente24, 2021, 12, 16));
        assertTrue(emprestimos.pegarEmprestimo(livro13, cliente25, 2021, 12, 13));
        emprestimos.listarAtrados();                                                      // Testando metodo criado exibir clientes atrasador a parti data de inicio do emprestimo
                                                                                          // comparado com a data em que o metodo vai ser rodado e tem o resultado dos dias de atraso
                                                                                           // tests ok

    }
}
