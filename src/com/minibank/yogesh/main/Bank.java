package com.minibank.yogesh.main;

import java.util.Scanner;

import com.minibank.yogesh.exceptions.InsufficientfundsException;
import com.minibank.yogesh.exceptions.NegativeAmountException;
import com.minibank.yogesh.exceptions.NotInitializedException;

import com.minibank.yogesh.specification.BankAccount;

import com.minibank.yogesh.blogic.HdfcBankAccount;
import com.minibank.yogesh.blogic.ICICIBankAccount;
import com.minibank.yogesh.blogic.SBIBankAccount;



public class Bank {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter Acount Number :");
		
	    long accNum = scn.nextLong(); scn.nextLine();
	    
	    System.out.println("Enter Account Holder Name :");
	    
	    String accHName = scn.nextLine();
	    
	    System.out.println("Enter Balace: ");
	    
	    double balance = scn.nextDouble();
	    
	    BankAccount acc;
	    acc= new HdfcBankAccount(accNum,accHName,balance);
	    //acc=new ICICIBankAccount(accNum,accHName,balance);
	    try {
		
		loop:while(true) 
		{
		    
			System.out.println("\nChoose one option");
			System.out.println("  1. Deposit");
			System.out.println("  2. Withdraw");
			System.out.println("  3. Current Balance");
			System.out.println("  4. Account Details");
			System.out.println("  5. Exit");
			
			System.out.println("Enter the Option");
			int option =scn.nextInt();
			
			switch(option) 
			{
			
			case 1: //deposite case
				try {
				System.out.println("Enter Deposite Amount");
				 double amt = scn.nextDouble();
				 
				 acc.deposite(amt);
				 System.out.println("Amount is credited");
				}
				catch(NegativeAmountException e) 
				{
					System.out.println(e.getMessage());
				}
				
			    break;
			    
			case 2: //Withdraw Case
			
				try 
				{
					System.out.println("Enter Withdraw Amount ");
					double amt = scn.nextDouble();
					
					acc.withdraw(amt);
					System.out.println("Amount is debited");
				}
				catch(NegativeAmountException|InsufficientfundsException e) 
				{
				 System.out.println(e.getMessage());
				}
				break;
				
			case 3://Current Balance
				
			     System.out.println("Current Balance");
			     acc.currenBalance();
				
				break;
			case 4:
				System.out.println("Account Details");
				acc.display();
				break;
			case 5: //exit
				System.out.println("Thank You Visit Again!");
				
				break loop;
				
			default ://Wrong Option
				System.out.println("Wrong Option");
				
			} //Switch Close
			
		} //loop close
	    }
	    catch(NotInitializedException e) 
	    {
	    	
	    }
	}
}
	    	
				
					
					
				
				
					 
				
	    
	    
	    
		
	 
	
