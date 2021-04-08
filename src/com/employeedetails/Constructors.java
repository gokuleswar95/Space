package com.employeedetails;

public class Constructors {
	public Constructors() {
		System.out.println("Emp id is 1101");
	}
	public Constructors(String name) {
		System.out.println("Emp name is " + name);
	}
	public static void main(String[] args) {
		Constructors c = new Constructors();
		Constructors c1 = new Constructors("Gokul");
	}
}
