package com.employeedetails;

public class EmployeeDetails {
	public void empId() {
		System.out.println("The Employee Id is 10101");
	}
	private void empName() {
		System.out.println("The Employee Name is Gokul");
	}
	private void empDob() {
		System.out.println("The DOB is 12-02-1995 ");
	}
	private void empEmail() {
		System.out.println("Mail: gokul1995@gmail.com");
	}
	public static void main(String[] args) {
		EmployeeDetails emp = new EmployeeDetails();
		emp.empId();
		emp.empName();
		emp.empDob();
		emp.empEmail();

	}
		
}
