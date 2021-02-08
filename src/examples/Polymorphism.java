package examples;

public class Polymorphism {

	public static void main(String[] args) {
		Polymorphism pm = new Polymorphism();
		pm.a();

	}
	
	public void a(){
		System.out.println("A");
	}
	
	public void a(String s){
		System.out.println("Parametrised polymorphism");
	}

}
