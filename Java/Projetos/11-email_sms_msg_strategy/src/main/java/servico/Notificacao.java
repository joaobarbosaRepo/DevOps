package servico;

import entidade.Cliente;
import excecao.ClienteException;
import strategy.Email;
import strategy.MensagemStrategy;
import strategy.Sms;

public class Notificacao {
	    Mensagem mensagem = new Mensagem();
	    MensagemStrategy mensagemStrategy;
	    public MensagemStrategy getMensagemStrategy() {
	        return mensagemStrategy;
	    }
	    public String enviaNotificacao(Cliente cliente) {
	      
	    	if(cliente.getNome()!=null) {
	        	  if(cliente.getContato()!=null && cliente !=null) {
	        		  mensagemStrategy = new Email();
	        		  
	        	  }

	             if (cliente.getEmail() == null && cliente.getContato() != null) {
	                 mensagemStrategy = new Sms();

	             }
	             if (cliente.getContato() == null && cliente.getEmail() != null) {
	                 mensagemStrategy = new Email();

	             }
	             if( cliente.getContato()==null&& cliente.getEmail()==null) {
	            	 throw  new ClienteException("Deve ser inserido 1 email ou 1 contato!!!"); 
	             }
	            }  else{ throw  new ClienteException("Nome não pode ser nulo");}
	         
	            return  mensagemStrategy.enviaMensagem(mensagem.montaMensagem(cliente.getNome()));
	    }
	}

