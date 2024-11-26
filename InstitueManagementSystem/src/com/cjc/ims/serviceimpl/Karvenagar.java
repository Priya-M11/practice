package com.cjc.ims.serviceimpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cjc.ims.model.Batch;
import com.cjc.ims.model.Course;
import com.cjc.ims.model.Faculty;
import com.cjc.ims.model.Student;
import com.cjc.ims.servicei.CJC;

public class Karvenagar implements CJC {
	Scanner sc = new Scanner(System.in);
	List<Course> cList = new ArrayList<>();
	List<Faculty> fList = new ArrayList<>();
	List<Batch> bList = new ArrayList<>();
	List<Student> sList = new ArrayList<>();

	@Override
	public void addCourse() {
		Course c = new Course();
		System.out.print("\n Enter Course ID: ");
		c.setCid(sc.nextInt());
		System.out.print("\n Enter Course Name: ");
		c.setCourseName(sc.next());
		
		cList.add(c);
		System.out.println("\n Course Added...");
	}

	@Override
	public void viewCourse() {
		if(cList.isEmpty()) {
			System.out.println("No Course Found...");
		}else {
			System.out.println("\n| Course ID | Course Name |");
			for (Course c : cList) {
				System.out.println("  "+c.getCid()+ "         "+c.getCourseName());
			}
		}
	}

	@Override
	public void addFaculty() {
		Faculty f = new Faculty();
		System.out.print("\n Enter Faculty ID: ");
		f.setFid(sc.nextInt());
		System.out.print("\n Enter Faculty Name: ");
		f.setfName(sc.next());
		
		System.out.print("\n Select a course you want to assign to Faculty: ");
		viewCourse();
		
		int cid = sc.nextInt();
		
		for (Course c : cList) {
			if(c.getCid() == cid) {
				f.setC(c);
				break;
			}else {
				System.out.println("You have entered wrong Course Id...");
			}
		}
		fList.add(f);
		System.out.println("\n Faculty Added");
	}

	@Override
	public void viewFaculty() {
		if(fList.isEmpty()) {
			System.out.println("No Faculty Found...");
		}else {
			System.out.println("\n| Faculty ID | Faculty Name |Course Name |");
			for (Faculty f : fList) {
				System.out.println("  "+f.getFid()+"            "+f.getfName()+"       "+f.getC().getCourseName());
			}
		}
	}

	@Override
	public void addBatch() {
		Batch b = new Batch();
		System.out.print("\n Enter Batch Id: ");
		b.setBid(sc.nextInt());
		System.out.print("\n Enter Batch Name: ");
		b.setBname(sc.next());
		System.out.println("\n Select Faculty You want to assign for this Batch...");
		viewFaculty();
		
		int fid = sc.nextInt();
		for (Faculty f : fList) {
			if(f.getFid() == fid) {
				b.setF(f);
			}
		}
		bList.add(b);
		System.out.println("\n Batch Added...");
	}

	@Override
	public void viewBatch() {
		if(fList.isEmpty()) {
			System.out.println("No Batch Found...");
		}
		else {
			System.out.println("\n| Batch ID | Batch Name |Faculty Name |");
			for (Batch b : bList) {
				System.out.println("  "+b.getBid()+"          "+b.getBname()+"     "+b.getF().getfName());
			}
		}
	}

	@Override
	public void addStudent() {
		Student s = new Student();
		System.out.print("\n Enter Student Id: ");
		s.setSid(sc.nextInt());
		System.out.print("\n Enter Student Name: ");
		s.setSname(sc.next());
		 System.out.print("\n Select Batch: ");
		 viewBatch();
		 int bid = sc.nextInt();
		 
		 for(Batch b : bList) {
			 if(b.getBid() == bid) {
				 s.setB(b);
			 }
			 else {
				 System.out.println("Wrong Id...");
			 }
		 }
		 sList.add(s);
		 System.out.println("\n Student Added...");
	}

	@Override
	public void viewStudent() {
		if(sList.isEmpty()) {
			System.out.print("\n No Student Found...");
		}else {
			System.out.println("\n| Student ID | Student Name |Batch Name |");
			for(Student s : sList) {
				System.out.println("  "+s.getSid()+"           "+s.getSname()+"          "+s.getB().getBname());
			}
		}
	}
}