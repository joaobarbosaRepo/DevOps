package requestStrategy;

import exception.RequestStrategyException;

public class RequestMessageEmail implements RequestMessage {
  String email;
	@Override
	public String sendMessage(String message) {
	 if(message!= null) {
		email = "Envia Email- " +message;
		return email;
	   }throw new RequestStrategyException("message cannot be null");
	}	 
    

	@Override
	public String getMensagemStrategy() {
		return email;
	}

}
