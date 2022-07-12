package in.com.app.exception;

public class NoUserFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public NoUserFoundException() {
	}
	public NoUserFoundException(String msg) {
		super(msg);
	}
}
