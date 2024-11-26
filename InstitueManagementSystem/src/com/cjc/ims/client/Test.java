package com.cjc.ims.client;

import java.util.Scanner;

import com.cjc.ims.servicei.CJC;
import com.cjc.ims.serviceimpl.Karvenagar;

public class Test {
	public static void main(String[] args) {
		System.out.println("*******Institute Management System*******");
		Scanner sc = new Scanner(System.in);
		CJC c = new Karvenagar();
		
		while(true) {
			System.out.println();
			System.out.println("\n 1.Add Course\n 2.View Course\n 3.Add Faculty\n 4.View Faculty\n 5.Add Batch\n 6.View Batch\n 7.Add Student\n 8.View Student\n 9.Exit\n");
			System.out.print("\n Enter Your Choice: ");
			int ch = sc.nextInt();
			switch(ch) {
			case 1:
				c.addCourse();
				break;
			case 2:
				c.viewCourse();
				break;
			case 3:
				c.addFaculty();
				break;
			case 4:
				c.viewFaculty();
				break;
			case 5:
				c.addBatch();
				break;
			case 6:
				c.viewBatch();
				break;
			case 7:
				c.addStudent();
				break;
			case 8:
				c.viewStudent();
				break;
			case 9:
				System.exit(0);
			default:
				System.out.println("You have entered wrong choice...!");
				break;
			}
		}
	}
}