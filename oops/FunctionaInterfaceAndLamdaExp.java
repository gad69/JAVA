package oops;
@FunctionalInterface
interface Calc
{
	public int add(int i,int j);
}
public class FunctionaInterfaceAndLamdaExp {

	public static void main(String[] args) {
		Calc c = (i, j)-> i+j;
		System.out.println(c.add(10, 5));

	}

}
