package teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

import entidade.Cliente;
import excecao.ClienteException;
import servico.Notificacao;

public class ClienteTeste {
    @Test
    public void criaClienteTeste() {
        Cliente cliente = new Cliente("JULIA", "JULIA@GMAIL", "22556677");
        assertEquals("JULIA", cliente.getNome());
        assertEquals("JULIA@GMAIL", cliente.getEmail());
        assertEquals("22556677", cliente.getContato());                        // TESTA CRIAÇÃO DE CLIENTE.

    }

    @Test
    public void nomeNullTeste() {
        ClienteException thrown = assertThrows(ClienteException.class, () -> {
            Cliente cliente = new Cliente(null, "nomequaluqer@gmail.com", "4455566");   //TESTA EXCECAO NOME NULO.
            Notificacao notificacao= new Notificacao();
            notificacao.enviaNotificacao(cliente)  ;
        });
        assertEquals("Nome não pode ser nulo", thrown.getMessage());

    }

    @Test
    public void EmailAndContatoNullTeste() {
        ClienteException thrown = assertThrows(ClienteException.class, () -> {
            Cliente cliente = new Cliente("jorge", null, null);
            Notificacao notificacao= new Notificacao();
             notificacao.enviaNotificacao(cliente)  ;                                    //TESTA EXCECAO CONTATO E EMAIL NULLO.
        });
        assertEquals("Deve ser inserido 1 email ou 1 contato!!!", thrown.getMessage());

    }

}
