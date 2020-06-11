package com.unisys.entity;

public class InvalidNameException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidNameException() {
		super("Invalid name received!");
	}

	public InvalidNameException(String message) {
		super(message);
	}

	// this kind of constructor used for exception funnelling
	public InvalidNameException(Throwable cause) {
		super(cause);
	}

}
