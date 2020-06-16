package com.unisys.repository;

public class RepositoryException extends Exception {

	private static final long serialVersionUID = 6360934960413472574L;

	public RepositoryException() {
		super();
	}

	public RepositoryException(String message) {
		super(message);
	}

	public RepositoryException(Throwable cause) {
		super(cause);
	}

}
