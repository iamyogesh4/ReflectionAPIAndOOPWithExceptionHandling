package com.minibank.yogesh.exceptions;

public class InsufficientfundsException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	
	public InsufficientfundsException() 
	{
		super();
	}
	
	public InsufficientfundsException(String msg) 
	{
		super(msg);
	}

}
