package exception;

public class PizzaException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public PizzaException(String msg) {
		super(msg);
	}

}
