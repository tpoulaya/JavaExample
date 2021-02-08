package examples;

public class TernaryOperator extends WhichWillExecute{

	public static void main(String[] args) {
		int a = 50;
		int b = 1000;
		int c = 30;
		
		//largest number between 2 number
		int temp  = (a > b) ? a : b;
		System.out.println(temp);
		
		//largest number between 3 numbers
		int result = c > (a > b ? a : b) ? c :((a > b) ? a : b);
		System.out.println(result);
		
		//Calling static method.
		System.out.println("C :"+i);
	}

}
