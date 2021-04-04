package oops;

class A {
	public void methodA() {
		System.out.println("From method A");
	}

}

class B extends A {
	public void methodB() {
		System.out.println("From method B");
	}

}

public class C extends B {

	public void methodC() {
		System.out.println("From method C");
	}

	public static void checkMethod() {
		C c = new C();
		A a = new A();
		B b = new B();

		a.methodA();
		System.out.println();

		b.methodA();
		b.methodB();
		System.out.println();

		c.methodA();
		c.methodB();
		c.methodC();
	}

	public static void main(String[] args) {
       checkMethod();
	}

}
