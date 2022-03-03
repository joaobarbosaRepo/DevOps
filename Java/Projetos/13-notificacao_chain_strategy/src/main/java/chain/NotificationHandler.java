package chain;

import exception.HandelerException;
import requestStrategy.RequestMessage;

public abstract class NotificationHandler {
   private NotificationHandler nextHandler;

   public NotificationHandler(NotificationHandler nextHandler) {
		this.nextHandler = nextHandler;

	}

	public abstract String NotificationHandlerResquest(RequestMessage rm);

	protected String sendNext(RequestMessage rm) {
		if (this.nextHandler != null) {
			return this.nextHandler.NotificationHandlerResquest(rm);
		}
		       throw new HandelerException("notification failed");
	 }

}
