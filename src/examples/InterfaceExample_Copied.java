package examples;

public interface InterfaceExample_Copied {
	int s = 10; // normal variable declaration
	public void m1(); // normal method declaration
	final static int x = 20; // final static variable declaration
	default void method(){
		System.out.println("Default method.");
	}
	
	static void me(){
		System.out.println("Static method.");
	}
}
