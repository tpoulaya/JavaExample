package examples;


/*
 * A singleton class is a class that can have only one object (an instance of the class) at a time.
 * 
 * 	Make constructor as private.
	Write a static method that has return type object of this singleton class.Here, the concept of Lazy initialization is used to write this static method.
 * 
 */

public class SingleTonClass {
	
	private static SingleTonClass singleTonObj = null;
	
	/*static {
		singleTonObj =  new SingleTonClass();
	}*/
	
	private SingleTonClass() {
		
	}
	
	public static SingleTonClass getInstance() {
		if(singleTonObj == null) {
			singleTonObj = new SingleTonClass();
		}
		return singleTonObj;
	}
	
	private void display() {
		System.out.println("It's working....");
	}

	public static void main(String[] args) {
		SingleTonClass obj = new SingleTonClass();
		obj.display();
		System.out.println("Hashcode 1:"+obj.hashCode());
		
		SingleTonClass obj1 = new SingleTonClass();
		obj1.display();
		System.out.println("Hashcode 1_copy:"+obj1.hashCode());
		
		SingleTonClass obj2 = getInstance();
		obj2.display();
		System.out.println("Hashcode 2:"+obj2.hashCode());
		
		getInstance().display();
		
		SingleTonClass obj3 = getInstance();
		obj3.display();
		System.out.println("Hashcode 3:"+obj3.hashCode());
	}
}
