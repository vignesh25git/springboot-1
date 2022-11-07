package com.vicky.exception;

public class InvalidAgeException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String message;
	
	public InvalidAgeException() {
		super();
	
	}

	public InvalidAgeException(String message) {
		super(message);
		this.message = message;
	}
	
	

}
