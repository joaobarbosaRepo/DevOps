package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.jupiter.api.Test;
import exception.RequestStrategyException;
import requestStrategy.RequestMessage;
import requestStrategy.RequestMessageEmail;
import requestStrategy.RequestMessageSms;
import requestStrategy.RequestMessageWhatsApp;

public class StrategyRequestExceptionTest {
	@Test
	public void testMessageNullWapp() {
		RequestStrategyException thrown = assertThrows(RequestStrategyException.class, () -> {
			RequestMessage rm = new RequestMessageWhatsApp();
			rm.sendMessage(null);
		});
		assertEquals("message cannot be null", thrown.getMessage());

	}

	@Test
	public void testMessageNullSms() {
		RequestStrategyException thrown = assertThrows(RequestStrategyException.class, () -> {
			RequestMessage rm = new RequestMessageSms();
			rm.sendMessage(null);
		});
		assertEquals("message cannot be null", thrown.getMessage());

	}

	@Test
	public void testMessageNullEmail() {
		RequestStrategyException thrown = assertThrows(RequestStrategyException.class, () -> {
			RequestMessage rm = new RequestMessageEmail();
			rm.sendMessage(null);
		});
		assertEquals("message cannot be null", thrown.getMessage());

	}
}
