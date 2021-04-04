package oops;

abstract class Bike
{
	public abstract void run();
	public void m1()
	{
		System.out.println("From m1");
	}
}
class ActiveHonda extends Bike
{
	public void run()
	{
		System.out.println("Good @ Hyderabad Roads");
	}
	public void m1()
	{
		System.out.println("From m1");
	}
}
class FZ extends Bike
{
	public void run()
	{
		System.out.println("Feel Like Sports Bike");
	}
}
 class AbstractionDemo {

	public static void main(String[] args) {
		ActiveHonda a = new ActiveHonda();
		a.run();
		a.m1();
		Bike b1 = new ActiveHonda();
		b1.run();
		b1.m1();
		Bike b2 = new FZ();
		b2.run();
		b2.m1();
	
	}

}
