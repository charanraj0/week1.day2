package assignment.week1.day2;

public class EmployeeDetails {
	int empId = 2022;
	String employeeName = "Vikram";
	String address = "Chennai";
	double salary = 173643.98;
	long number = 9876543210L;

	public String printEmployeeName() {
		return employeeName;
	}

	public int printEmpId() {
		return empId;
	}

	public String getEmployeeAddress() {
		return address;

	}
	public double printEmployeeSalary() {
		return salary;
	}
	public long printEmployeeMobileNumber() {
		return number;
	}
	
	public static void main(String[] args) {
		EmployeeDetails obj = new EmployeeDetails();
		String name = obj.printEmployeeName();
		System.out.println("Employee Name: "+name);
		int id = obj.printEmpId();
		System.out.println("Employee ID: "+id);
		String address2 = obj.getEmployeeAddress();
		System.out.println("Address: "+address2);
		double employeeSalary = obj.printEmployeeSalary();
		System.out.println("Monthly Salary: "+employeeSalary);
		long mobileNumber = obj.printEmployeeMobileNumber();
		System.out.println("Mobile Number: "+mobileNumber);
	}
}
