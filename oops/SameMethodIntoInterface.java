package oops;

interface One
{
	public void color();
}
interface Two
{
	public void color();
}

public class SameMethodIntoInterface implements One,Two{
	
	public void color()
	{
		System.out.println("Common interface method");
	}
	
	
	public static void main(String[] args) {
		SameMethodIntoInterface obj = new SameMethodIntoInterface();
		obj.color();
		One o = new One(){
			public void color()
			{
				System.out.println("RED");
			}
		};
		o.color();
		Two t = new Two(){
			public void color()
			{
				System.out.println("GREEN");
			}
		};
		t.color();
	}

}
