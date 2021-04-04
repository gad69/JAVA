package oops;

class X 
{
	public void methodX(){
		System.out.println("From x method");
	}
}
class Y extends X
{
	public void methodY()
	{
		System.out.println("From y method");
	}
}
class Z extends X
{
	public void methodZ()
	{
		System.out.println("From z method");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		Y  y = new Y();
		Z z = new Z();
		y.methodX();
		y.methodY();
		System.out.println();
		z.methodX();
		z.methodZ();

	}

}
