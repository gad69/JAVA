package oops;
class Employee1
{
	public double salary = 5000;
}
class HourlyEmployee1 extends Employee1
{
	public double bonus = 500;
}
class RegularEmployee1 extends Employee1
{
	public double bonus = 1000;
}
public class InheritanceDemo {

	public static void main(String[] args) {
		HourlyEmployee1 hourlyEmployee = new HourlyEmployee1();
		RegularEmployee1 regularEmployee = new RegularEmployee1();
		System.out.println("     HourlyEmployee PaySlip     ");
		System.out.println("---------------------------------");
		System.out.println("HourlyEmployee Salary  : "+hourlyEmployee.salary);
		System.out.println("HourlyEmployee Bonus   : "+hourlyEmployee.bonus);
		System.out.println("---------------------------------------");
		System.out.println("Total Salary           : "+(hourlyEmployee.salary+hourlyEmployee.bonus));
        System.out.println();
        System.out.println("     RegularEmployee PaySlip     ");
		System.out.println("---------------------------------");
		System.out.println("RegularEmployee Salary  : "+regularEmployee.salary);
		System.out.println("RegularEmployee Bonus   : "+regularEmployee.bonus);
		System.out.println("---------------------------------------");
		System.out.println("Total Salary           : "+(regularEmployee.salary+regularEmployee.bonus));
	}

}
