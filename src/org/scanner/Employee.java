package org.scanner;

import java.util.Scanner;

public class Employee {
         public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("enter your empid");
			int id= s.nextInt();
			System.out.println("enter your empname");
			String name= s.next();
			System.out.println("ente your emp Emailid");
		    String email=s.next(); 
			System.out.println("enter your empphone");
			Long phone=s.nextLong(); 
			System.out.println("enter your empsalary");
			float sal=s.nextFloat(); 
			System.out.println("enter your empgender");
			String gender= s.next();
			System.out.println("enter your empcity");
			String city= s.next();
			
			System.out.println("\nid;"+id);
			System.out.println("name;"+name);
			System.out.println("email;"+email);
			System.out.println("phone;"+phone);
			System.out.println("salary;"+sal);
			System.out.println("gender;"+gender);
			System.out.println("city;"+city);
         }

		}

