package requestStrategy;

import exception.RequestStrategyException;

public class RequestMessageSms implements RequestMessage {

	public String sms;

	@Override
	public String sendMessage(String message) {
	   if(message!=null) {
		sms="Enviando sms- " + message;
		return  sms;
	   } throw new RequestStrategyException("message cannot be null");
	}

	@Override
	public String getMensagemStrategy() {
		
		return sms;
	}



}
