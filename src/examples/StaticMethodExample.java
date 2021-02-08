package examples;

public class StaticMethodExample {
	static int i = 10;
	int s = 30;

	public static void main(String[] args) {
		System.out.println("In main");
		myMethod();
		System.out.println(i);
		
		//static nested class - non-static method
		StaticMethodExample.MyNestedClass obj = new StaticMethodExample.MyNestedClass();
		obj.disp();
		
		//static nested class - static method 
		obj.display();
	}
	
	//Static methods can be accessed directly in static and non-static methods.
	static void myMethod(){
		System.out.println("My Method.");
		i = 20;
		//Static method can not able to access non-static variable.
		//System.out.println(s);
	}
	
	//Non static method can access static and non-static variable.
	public void nonStaticMethod(){
		System.out.println(i);
		System.out.println(s);
	}
	
	//Static block will execute first.
	static{
		System.out.println("in static block");
	}
	
	
	/*
	 * A class can be made static only if it is a nested class.

		- Nested static class doesn’t need reference of Outer class
		- A static class cannot access non-static members of the Outer class	
	 */
	
	
	//Static class
	static class MyNestedClass{
		//non-static method
		public void disp(){
			System.out.println("non-static method.");
			// System.out.println(s); //can't access non-static members of outer class
			new StaticMethodExample().nonStaticMethod();
		}
		
		//static method
		static void display(){
			System.out.println("static method.");
		}
	}

}
