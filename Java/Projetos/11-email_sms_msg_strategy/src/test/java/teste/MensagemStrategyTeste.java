package teste;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import entidade.Cliente;
import servico.Notificacao;
import strategy.Email;
import strategy.Sms;

public class MensagemStrategyTeste {
@Test
    public void emailTeste(){
        Cliente cliente1 = new Cliente("Janete","janet@gmail.com",null);
        Notificacao notificacao= new Notificacao();                                //Testa envio de email quando SMS é nulo.
        notificacao.enviaNotificacao(cliente1);
        assertTrue(notificacao.getMensagemStrategy()instanceof Email);
    }
 @Test
    public void smsTeste(){
        Cliente cliente1 = new Cliente("Julio",null,"22334455");
        Notificacao notificacao= new Notificacao();                           
        notificacao.enviaNotificacao(cliente1);                                   // Testa envio de SMS quando  email é nulo.
        assertTrue(notificacao.getMensagemStrategy()instanceof Sms);
    }
    @Test
    public void semNullTeste(){
        Cliente cliente1 = new Cliente("jubileu","jubileu@gmail","22334455");
        Notificacao notificacao= new Notificacao();
        notificacao.enviaNotificacao(cliente1);
       assertTrue(notificacao.getMensagemStrategy() instanceof Email);  //Por padrao quando temos todos os atributos deve ser enviado um email.
    }

}
