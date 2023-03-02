package org.howard.edu.lsp.assignment4;
/**
 * Throws an exception when the largest and smallest method is called if the set is empty
 * @author jennaijackson
 *
 */
public class IntegerSetException extends Exception {
	/**
	 * Throws an exception
	 * @param message (the message that will print when the IntegerSetException method is thrown)
	 */
	public IntegerSetException(String message) {
		super(message);
	}
}
