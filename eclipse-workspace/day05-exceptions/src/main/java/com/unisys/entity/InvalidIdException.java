package com.unisys.entity;

public class InvalidIdException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidIdException() {
		super();
	}

	public InvalidIdException(String message) {
		super(message);
	}

	public InvalidIdException(Throwable cause) {
		super(cause);
	}

	
}
