package examples;

public class Interface_MultipleInheritance_Tests implements InterfaceExample, InterfaceExample_Copied {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		InterfaceExample.super.method();
	}

}
