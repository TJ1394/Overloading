package com.pkg1;

import java.util.Scanner;

public class BankingSystem {
	static Scanner s = new Scanner(System.in);
	double balance = 50.55;
	String name="Tejaswini";
	
	public static void main(String[] args) {
		BankingSystem bk = new BankingSystem();
		System.out.println("name is" + bk.name);
		
		System.out.println("Welcome to online banking");
		
		System.out.print("enter your account number : ");
		int a;
		a = s.nextInt();// input accept krse and return krse
		// System.out.println("The account num is" + a);
		int b = 1234;

		if (a == b)
		{
			System.out.println("pin accepted");
			System.out.println("What kind of function you want to perform");
		} 
		else
		{
			System.out.println("try again");
		}
		System.out.println("slect menu");
		System.out.println("1.deposite");
		System.out.println("2.withdrawl");
		System.out.println("3.balance inquery");
		int u =s.nextInt();
		System.out.println("operation is being performed"+ '\n'+ u);
		
		switch (u) {
		case 1:
			bk.deposite();
			
			break;
		case 2:
			bk.withdrawl();
			
			break;
		case 3:
			bk.balanceEnquery();
			
			break;

		default:
			System.out.println("invalid option");
			break;
		}


		
	}
	
	public void deposite()
	{
		System.out.println("Enter deposite amount");
		int amt = s.nextInt();
		balance = amt+balance;
		System.out.println("your balance is:" + balance);
	}
	
	public void withdrawl()
	{
		
		System.out.println("Enter withdrawl amount");
		int amt = s.nextInt();
		if(amt<=balance)
		{
			System.out.println("u r eligible for withdrwal");
		}
		else
		{
			System.out.println("u r not eligible for withdrwal");
		}
		balance = amt - balance;
		System.out.println("your balance is:" + balance);
	}
	
	public void balanceEnquery()
	{
		System.out.println("your balanve is :" + balance);
		
	}
	
	
	
	
	
	
	
	/*private void customerDetails()
	{
		System.out.println("name of customer");
	}
	
	protected void accountNum()
	{
		System.out.println("enter acc no: ");
	}
	
	 void address()
	{
		System.out.println("adress is");
	}
	 
	 public void postalCode()
	 {
		 customerDetails();
		 accountNum();
		 address();
		 balanceEnquery();
	 }
	
	*/
	
	
	
    
	
	
	
	
}
