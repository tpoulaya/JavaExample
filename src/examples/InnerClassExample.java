package examples;

public class InnerClassExample {
	private int x = 10;
	public static void main(String[] args) {
		InnerClassExample.inner inn = new InnerClassExample().new inner();
		inn.show();
		System.out.println(inn.rOuterClassInstanceVar());
	}
	
	class inner{
		public void show(){
			System.out.println("Inner class"+x);
		}
		
		public int rOuterClassInstanceVar(){
			return x;
		}
	}

}
