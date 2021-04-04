package oops;

@FunctionalInterface
interface Greetings {
	public void sayHello();
}

public class LamdaDemo {

	public static void main(String[] args) {
		Greetings g = () ->	System.out.println("Welcome to java 8");
		g.sayHello();
	}

}
