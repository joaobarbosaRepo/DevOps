package Servico;

import java.util.ArrayList;
import java.util.List;

import command.Deposito;
import command.Saque;
import command.Solicitacao;
import exception.CaixaException;

public class CaixaEletronico {
	private List<Solicitacao> solicitacao = new ArrayList();
	public CaixaEletronico() {
 
	}
	
	public double calculasaldo() {
		double saldo = 0;
		for (int i = 0; i < solicitacao.size(); i++) {
		   saldo += solicitacao.get(i).solicitar();
		
		 }
		
		     return saldo;
	 }

	public void realizarDeposito( double valor) {
		if (valor > 0) {
		  Solicitacao sl = new Deposito(valor);
		   solicitacao.add(sl);
			System.out.println("-Realizando deposito="+ valor +" saldo total=  " + calculasaldo());
		      }    
		      else {
	           throw new CaixaException("Valor não pode ser - ou = 0");
		}
		
	}

	public void realizaSaque( double valor) {
		if (valor <= calculasaldo()) {
		
		  Solicitacao sl = new Saque(valor);
		   solicitacao.add(sl);
			System.out.println("-Realizando saque=" + valor +" Saldo total= " + calculasaldo());
			  
		    
		}   else {
		       throw new CaixaException("Valor de saque não pode ser maior que o valor em conta");
		   } 
		
	}

	public List<Solicitacao> getSolicitacao() {
		return solicitacao;
	}

}
