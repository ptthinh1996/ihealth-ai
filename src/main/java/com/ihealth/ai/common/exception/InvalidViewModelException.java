package com.ihealth.ai.common.exception;

public class InvalidViewModelException extends RuntimeException {

	private static final long serialVersionUID = -4060640148400587305L;

	public InvalidViewModelException() {
		super();
	}

	public InvalidViewModelException(String msg) {
		super(msg);
	}

	public InvalidViewModelException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
