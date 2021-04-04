package oops;

public class MethodOverLoading {
	
	
	public int add(int i, int j,int k)
	{
		return i+j+k;
	}

	public static void main(String[] args) {
		MethodOverLoading obj = new MethodOverLoading();
		System.out.println(obj.add(10, 20));
		System.out.println(obj.add(10, 20, 30));

	}

}
 class hi{
	public int add(int i,int j)
	{
		return i+j;
	}
	
	
	
}
