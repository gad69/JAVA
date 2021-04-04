package oops;

interface First
{
	public void firstMethod();
}
interface Second extends First
{
	public void secondMethod();
}

public class InterfaceDemo implements Second{
	
	@Override
	public void secondMethod() {
	System.out.println("Second Interface method");
		
	}

	@Override
	public void firstMethod() {
		System.out.println("Frist Interface Method");
		
	}

	public static void main(String[] args) {
		InterfaceDemo obj = new InterfaceDemo();
		obj.firstMethod();
		obj.secondMethod();

	}



}
