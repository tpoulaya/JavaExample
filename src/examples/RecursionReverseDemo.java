package examples;

public class RecursionReverseDemo {

	public static void main(String[] args) {
		RecursionReverseDemo.reverseMethod(12345);
	}
	
	public static void reverseMethod(int number){
		if(number < 10){
			System.out.print(number);
			return;
		}else{
			System.out.print(number%10);
			reverseMethod(number/10);
		}
	}

}
