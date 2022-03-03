package chain;

import exception.HandelerException;
import requestStrategy.RequestMessageSms;
import requestStrategy.RequestMessage;


public class NotificationHandlerSMS extends NotificationHandler {

	public NotificationHandlerSMS(NotificationHandler nextHandler) {
		super(nextHandler);
	}

	@Override
	public String NotificationHandlerResquest(RequestMessage rm) {
		if (rm instanceof RequestMessageSms) {
			String menssage = rm.getMensagemStrategy();
			System.out.println(menssage);
			return  menssage;
		}
		try {return sendNext(rm);}
		   catch(Exception  e) {
			  throw new HandelerException ("ERROR MOVING TO NEXT");
		   }


 }
}
