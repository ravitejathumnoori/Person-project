package com.test.concurr.Test_Lock.exceptions;

public class PersonNotFoundException extends RuntimeException {
	

	private static final long serialVersionUID = 1L;

	public PersonNotFoundException(String exceptionName) {
		super(exceptionName);
	}
}
