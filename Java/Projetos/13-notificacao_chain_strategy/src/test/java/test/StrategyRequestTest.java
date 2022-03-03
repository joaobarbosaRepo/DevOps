package test;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import requestStrategy.RequestMessageSms;
import requestStrategy.RequestMessage;
import requestStrategy.RequestMessageWhatsApp;
import requestStrategy.RequestMessageEmail;



public class StrategyRequestTest {
@Test
public void testEmail() {
	RequestMessage  rm = new RequestMessageEmail	();
	assertTrue(rm instanceof RequestMessageEmail);
}
@Test
public void testSMS() {
	RequestMessage  rm = new RequestMessageSms();
	assertTrue(rm instanceof RequestMessageSms);
}
@Test
public void testWhatsApp() {
	RequestMessage  rm = new RequestMessageWhatsApp();
	assertTrue(rm instanceof RequestMessageWhatsApp);
}

}

