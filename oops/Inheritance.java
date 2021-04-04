package oops;

class Employee {
	public double salary = 5000;

}

class HourlyEmployee extends Employee {
	public double bonus = 500;
}

class RegularEmployee extends Employee {
	public double bonus = 1000;

}

 class Inheritance {

	public static void main(String[] args) {
		HourlyEmployee hourlyEmployee = new HourlyEmployee();
		RegularEmployee regularEmployee = new RegularEmployee();
		System.out.println("---Hourly Employee ---");
		hourlyEmployee.salary=15000;
		System.out.println("Hourly Employee Salary : " + hourlyEmployee.salary);
		System.out.println("Hourly Employee Bonus  : " + hourlyEmployee.bonus);
		System.out.println("-----------------------------------------------");
		System.out.println("Total Salary           :" + (hourlyEmployee.salary + hourlyEmployee.bonus));
		System.out.println("-----------------------------------------------");
		System.out.println();
		System.out.println("---Regular Employee ---");
		System.out.println("Regular Employee Salary : " + regularEmployee.salary);
		System.out.println("Regular Employee Bonus  : " + regularEmployee.bonus);
		System.out.println("-----------------------------------------------");
		System.out.println("Total Salary           :" + (regularEmployee.salary + regularEmployee.bonus));
		System.out.println("-----------------------------------------------");

	}

}
