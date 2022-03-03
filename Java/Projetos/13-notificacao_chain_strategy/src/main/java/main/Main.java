package main;

import chain.NotificationHandler;
import chain.NotificationHandlerEmail;
import chain.NotificationHandlerSMS;
import chain.NotificationHandlerWhatsapp;
import requestStrategy.RequestMessageSms;
import requestStrategy.RequestMessage;
import requestStrategy.RequestMessageWhatsApp;
import requestStrategy.RequestMessageEmail;

public class Main {

	public static void main(String[] args) {
		 NotificationHandler wapp= new NotificationHandlerWhatsapp(null);
		 NotificationHandler sms= new NotificationHandlerSMS(wapp);
		 NotificationHandler email= new NotificationHandlerEmail(sms);
		 RequestMessage rm1= new RequestMessageEmail(); 
		 RequestMessage rm2= new RequestMessageSms();
		 RequestMessage rm3= new RequestMessageWhatsApp();
		 rm1.sendMessage("Bom dia");
		 rm2.sendMessage("Boa tarde");
		 rm3.sendMessage("Boa noite");
		 
		 email.NotificationHandlerResquest(rm1);
		 email.NotificationHandlerResquest(rm2);
		 email.NotificationHandlerResquest(rm3);
		 
		
		
		 

	}

}
