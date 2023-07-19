package com.minibank.yogesh.specification;

import com.minibank.yogesh.exceptions.NegativeAmountException;

import com.minibank.yogesh.exceptions.InsufficientfundsException;

public interface BankAccount {
	
	public void deposite(double amt) throws NegativeAmountException;
	
	public void withdraw(double amt) throws NegativeAmountException,InsufficientfundsException;
	
	public void currenBalance();
	
	public void display();

}
