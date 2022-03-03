package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

import chain.NotificationHandler;
import chain.NotificationHandlerEmail;
import chain.NotificationHandlerSMS;
import chain.NotificationHandlerWhatsapp;
import exception.HandelerException;
import exception.RequestStrategyException;
import requestStrategy.RequestMessage;
import requestStrategy.RequestMessageEmail;
import requestStrategy.RequestMessageSms;
import requestStrategy.RequestMessageWhatsApp;


public class NotificationHandlerTest {
@Test	
public void handLerNotificationEmailTest() {
	 NotificationHandler wapp= new NotificationHandlerWhatsapp(null);
	 NotificationHandler sms= new NotificationHandlerSMS(wapp);
	 NotificationHandler email= new NotificationHandlerEmail(sms);
	 RequestMessage rm1= new RequestMessageEmail(); 
	 rm1.sendMessage("Testa envio Email");
	 assertEquals("Envia Email- Testa envio Email",email.NotificationHandlerResquest(rm1));
}
@Test	
public void handLerNotificationSMSTest() {
	 NotificationHandler wapp= new NotificationHandlerWhatsapp(null);
	 NotificationHandler sms= new NotificationHandlerSMS(wapp);
	 NotificationHandler email= new NotificationHandlerEmail(sms);
	 RequestMessage rm1= new RequestMessageSms(); 
	 rm1.sendMessage("Testa envio SMS");
	 assertEquals("Enviando sms- Testa envio SMS",email.NotificationHandlerResquest(rm1));
}
@Test	
public void handLerNotificationWappTest() {
	 NotificationHandler wapp= new NotificationHandlerWhatsapp(null);
	 NotificationHandler sms= new NotificationHandlerSMS(wapp);
	 NotificationHandler email= new NotificationHandlerEmail(sms);
	 RequestMessage rm1= new RequestMessageWhatsApp(); 
	 rm1.sendMessage("Testa envio whatsApp");
	 assertEquals("Enviando whatsApp- Testa envio whatsApp",email.NotificationHandlerResquest(rm1));
}
@Test
public void handlerNull() {

	HandelerException thrown = assertThrows(HandelerException.class, () -> {
		NotificationHandler wapp= new NotificationHandlerWhatsapp(null);
		 NotificationHandler sms= new NotificationHandlerSMS(null);
		 NotificationHandler email= new NotificationHandlerEmail(null);
		 RequestMessage rm1= new RequestMessageWhatsApp(); 
		 email.NotificationHandlerResquest(rm1);
		});
		assertEquals("notification failed", thrown.getMessage());

	}

	
}


