package br.ufrj.testproj.exceptions;

public class ZeroSideException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ZeroSideException() {

	}

	public ZeroSideException(String message) {
		super(message);
	}

	public ZeroSideException(Throwable cause) {
		super(cause);
	}

	public ZeroSideException(String message, Throwable cause) {
		super(message, cause);
	}

}
