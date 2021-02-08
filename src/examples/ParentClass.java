package examples;

public class ParentClass {
	
	public void method1(){
		System.out.println("Parent class");
	}
	
	public int method1(int a){
		System.out.println("Parent class");
		return a;
	}

	public void method1(String s){
		System.out.println("Parent class overloading" + s);
	}
}
