package com.employeedetails;

import java.util.Scanner;

public class EmployeeScan {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a sentence");
		String sen = s.nextLine();
		System.out.println("You entered " + sen);
		
		System.out.println("Enter a number");
		int num = s.nextInt();
		System.out.println("You entered " + num);
		
		System.out.println("Enter a word");
		String word = s.next();
		System.out.println("You entered " + word);
		
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println(a+b);
	
	}

}
