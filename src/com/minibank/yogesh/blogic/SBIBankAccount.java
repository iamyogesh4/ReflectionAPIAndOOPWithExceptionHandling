package com.minibank.yogesh.blogic;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.minibank.yogesh.exceptions.InsufficientfundsException;
import com.minibank.yogesh.exceptions.NegativeAmountException;
import com.minibank.yogesh.specification.BankAccount;

public class SBIBankAccount implements BankAccount {
	
	private static String bankName;
	
	private static String branchName;
	
	private static String ifsc;
	
	private long accNum;
	private String accHName;
	private double balance;
	
	static 
	{
		 try(BufferedReader br = 
					new BufferedReader(new FileReader("sbidetails.txt")))
		{
			 bankName=br.readLine();
			 
			 branchName=br.readLine();
			 
			 ifsc=br.readLine();
			 
			
		}
		catch(FileNotFoundException e) 
		 {
			System.out.println("sbidetails file not found");
		 }
		 
		 catch(IOException e) 
		 {
			 e.printStackTrace();
		 }
	}

	public SBIBankAccount(long accNum, String accHName, double balance) {
		
		this.accNum = accNum;
		this.accHName = accHName;
		this.balance = balance;
	}

	@Override
	public void deposite(double amt) throws NegativeAmountException {
		if(amt<=0) throw new NegativeAmountException("Do Not Pass Negative Number");
		
		else 
		{
			balance = amt+balance;
		}
		
		
	}

	@Override
	public void withdraw(double amt) throws NegativeAmountException, InsufficientfundsException {
		if(amt<=0)throw new NegativeAmountException("Do Not Pass Negative Number");
		
		if(amt>balance)throw new InsufficientfundsException("Insufficient Fund"); 
		
		balance=balance-amt;
		
		
	}

	@Override
	public void currenBalance() {
		
	   System.out.println(balance);
		
	}

	@Override
	public void display() {
		System.out.println("Bank Name:"+bankName);
		System.out.println("BranchName"+branchName);
		System.out.println("IFSC CODE"+ifsc);
		System.out.println("Account Number"+accNum);
		System.out.println("Account Holder Name"+accHName);
	    System.out.println("Account Balance");
	}
		
	}
	
	
	
	
	
	
	
	
	
	


