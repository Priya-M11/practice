package com.braindata.bankmanagement.client;

import com.braindata.bankmagement.serviceImpl.*;
import com.braindata.bankmanagement.service.*;
import java.util.Scanner;

public class Test {
		public static void main(String[] args)
		{
			System.out.println("*******Bank Management System*******");
		Scanner sc = new Scanner(System.in);
			
			Rbi bank=new Sbi();
			//Display proper msg for calling methods.
			//As per user choice perform bank operation using switch case
			while(true) {
				System.out.println();
				System.out.println("\n 1.Create Account\n 2.Display All Details\n 3.Deposit Amt\n 4.Withdrawal Amt\n 5.Balance Check\n 6.Exit\n");
				System.out.print("\n Enter Your Choice: ");
				int ch = sc.nextInt();
				switch(ch) {
				
				case 1:bank.createAccount();
					   break;
					
				case 2:bank.displayAllDetails();
				       break;
				       
			    case 3:bank.depositeMoney();
				       break;
				
			    case 4:bank.withdrawal();
			           break;
			       
			    case 5:bank.balanceCheck();
			             break;
			             
			    case 6:System.exit(0);
				default:
					System.out.println("You have entered wrong choice...!");
					break;
			
		
				       
	    	 }
	}

		}	}	


