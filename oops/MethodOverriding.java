package oops;
class Parent
{
	public void m1()
	{
		System.out.println("--Parent--");
	}
	static{
		
		System.out.println("abc");
	}
	 public Parent (){
		System.out.println("abc");
	}
		
		
	}


class Child extends Parent
{
	public void m1()
	{
		System.out.println("--Child---");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.m1();
		Child c = new Child();
		c.m1();
		Parent p1 = new Child();
		p1.m1();
	
		
	
	}

}
