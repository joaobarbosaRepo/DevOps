package chain;
import exception.HandelerException;
import requestStrategy.RequestMessage;
import requestStrategy.RequestMessageEmail;

public class NotificationHandlerEmail  extends NotificationHandler {

	public NotificationHandlerEmail(NotificationHandler nextHandler) {
		super(nextHandler);

	}

	@Override
	public String NotificationHandlerResquest(RequestMessage rm) {
		if (rm instanceof RequestMessageEmail) {
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
