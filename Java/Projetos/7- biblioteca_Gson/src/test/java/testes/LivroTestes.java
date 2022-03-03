package testes;

import entidade.Cliente;
import entidade.Livro;
import org.junit.jupiter.api.Test;
import servico.Clienteservico;
import servico.Emprestimoservico;
import servico.Livroservico;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LivroTestes {
    @Test
    public void addRemoveteste() {
        Livroservico livros=new Livroservico();
        Livro livro12= new Livro (12,"Vingadores","Stan Lee") ;
        Livro livro13= new Livro (13,"O senhor dos aneis","J. R. R. Tolkien ") ;
        assertTrue(livros.addLivro(livro12));
        assertTrue(livros.addLivro(livro13));
        livros.listarLivros();
        Cliente cliente24= new Cliente(36,"Rugal");
        Emprestimoservico emprestimos= new Emprestimoservico();
        assertTrue(emprestimos.pegarEmprestimo(livro13, cliente24, 2021, 12, 13));
        assertTrue(livros.removeLivro(12));                   //Testando se conseguimos remover o livro normalmente
        livros.listarLivros();
        assertFalse(livros.removeLivro(13));                   //Testando se conseguimos remover um livro emprestado
                                                                        // tests ok
    }
    @Test
    public void pesquisaAutorLivro() {
        Livroservico livros=new Livroservico();
        Livro livro12= new Livro (15,"Piratas do caribe","Monteiro Lobato") ;
        Livro livro13= new Livro (15,"A volta dos que não foram","Jhomsons ") ;
        assertTrue(livros.addLivro(livro12));
        assertTrue(livros.addLivro(livro13));
        assertTrue(livros.pesquisAutor("monteiro lobato"));                 //Teste pesquisa autor
        assertTrue(livros.pesquisaTitulo("A volta dos que não foram"));	    // Teste pesquisa título
    }
}
