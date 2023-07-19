package com.minibank.yogesh.exceptions;

public class NotInitializedException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public NotInitializedException() 
	{
		super();
	}
	
	public NotInitializedException(String msg) 
	{
		super(msg);
	}

}
