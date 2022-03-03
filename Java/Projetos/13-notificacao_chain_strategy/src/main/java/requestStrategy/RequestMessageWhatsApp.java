package requestStrategy;

import exception.RequestStrategyException;

public class RequestMessageWhatsApp implements RequestMessage{
	String whatsApp;

	@Override
	public String sendMessage(String message) {
		if(message!=null) {
		whatsApp= "Enviando whatsApp- " + message;
		return whatsApp;
		} throw new RequestStrategyException("message cannot be null");
	}

	@Override
	public String getMensagemStrategy() {
		
		return whatsApp ;
	}

}
