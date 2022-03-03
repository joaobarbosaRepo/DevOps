package chain;
import exception.HandelerException;
import requestStrategy.RequestMessage;
import requestStrategy.RequestMessageWhatsApp;

public class NotificationHandlerWhatsapp extends NotificationHandler {
	
    public NotificationHandlerWhatsapp(NotificationHandler nextHandler) {
		super(nextHandler);
	
	}
	
	   @Override
		public String NotificationHandlerResquest(RequestMessage rm) {
			if (rm instanceof RequestMessageWhatsApp) {
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
	


