package oops;

public class MultipleInheritance {

	public static void main(String[] args) {
		
		OperatingSystem os1 = new Windows();
		os1.print();
		OperatingSystem os2 = new Mac();
		os2.print();

	}

}
