package examples;

public class ChildClass extends ParentClass{

	public static void main(String[] args) {
		
		ParentClass bs = new ChildClass(); //upcasting...
		bs.method1();//overridden
		bs.method1(" Parent method...");
		
		//downcasting...
		ChildClass cs = (ChildClass) bs;
		cs.method1();
		cs.method1("");
		cs.methodChild();
	}
	
	@Override
	public void method1(){
		super.method1();
		System.out.println("Child class");
	}
	
	public void methodChild(){
		System.out.println("Method child....");
	}

}
