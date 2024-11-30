package com.braindata.bankmagement.serviceImpl;

import java.util.Scanner;

import com.braindata.bankmanagement.model.Account;
import com.braindata.bankmanagement.service.Rbi;

public class Sbi implements Rbi {
	String s;
	//implements all methods here
	Account a=new Account();
	Scanner sc=new Scanner(System.in);
	
	public void createAccount()
	{
		while(true)
		{
		System.out.println("create Account");
		
		System.out.println("plz enter account number=");
		String ano=sc.next();
		  if(ano.matches("\\d{14}"))
		  {
			  a.setAccNo(ano);
			  break;
		  }
		else
			{
			System.out.println("\nIt must be 14 digit");
			}
		}
		
		
		while(true)
		{
		System.out.println("\nEnter Name=");
        String name=sc.next();
        if(name.matches("[a-zA-Z]+"))
        {
		a.setName(name);
		break;
        }
        else
        {
        System.out.println("\nIt must be contain alphabetiec characters.");
        }
        }
		
		
	while(true)
	{
		System.out.println("\nEnter Mobno=");
		String mobno=sc.next();
		if(mobno.startsWith("+91")&& mobno.length()==13) 
		{
			String numberPart=mobno.substring(3);
			if(numberPart.matches("[1-9][0-9]{9}"))
			{
				a.setMobNo(mobno);
				break;
			}
			else
			{
				System.out.println("\nInvalid number");
			}
		}
	}
	
	
	while(true)
	{
		System.out.println("Enter AdharNo=");
		String aadhar=sc.next();
		if(aadhar.length()==12)
		{
			a.setAdharNo(aadhar);
			break;
		}
		else
		{
			System.out.println("\n Adhar number must be 12 digit.");
		}
		
	}
	
	while(true)
	{
		System.out.println("Enter Gender");
		String gender=sc.next();
		if(gender.equals("male")||gender.equals("female"))
		{
		a.setGender(gender);
		break;
		}
		else
		{
			System.out.println("\n No valid gender");
		}
	}
		
		while(true)
		{
		System.out.println("\nEnter age=");
			int age=sc.nextInt();
			if(age>=18)
			{
				a.setAge(age);
				break;
			}
			else
			{
				System.out.println("Age should be greater than 18");
			}
		}
		while(true)
		{
			System.out.println("\nenter balance");
			double bal=sc.nextDouble();
			if(bal>=500 && bal<=100000)
			{
			a.setBalance(bal);	
			break;
		    }
			else
				{
				System.out.println("balance must ne 500");
				}
		}

		}
	
	
	public void displayAllDetails()
	{
		System.out.println("AccNo:"+a.getAccNo());
		System.out.println("Name:"+a.getName());
		System.out.println("MobNo:"+a.getMobNo());
		System.out.println("AdharNo:"+a.getAdharNo());
		System.out.println("Gender"+a.getGender());
		System.out.println("Age:"+a.getAge());
		System.out.println("Balance:"+a.getBalance());
	}
	
	
	
	public void depositeMoney()
	{
		System.out.println("Enter deposit Money");
		Double d=sc.nextDouble();
		Double d1=a.getBalance()+d;
		a.setBalance(d1);
		System.out.println("Money deposited");
	}
	
	
	public void withdrawal()
	{
		System.out.println("Your withdrawal amt is=");
		Double d=sc.nextDouble();
		Double d1=a.getBalance()-d;
		a.setBalance(d1);
		System.out.println("Money withdrawal");
		
	}
	
	
	public void balanceCheck()
	{
		System.out.println("Your current balcne is="+a.getBalance());
	}
}
