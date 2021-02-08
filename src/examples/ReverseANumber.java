package examples;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseANumber {

	public int reverseNumber(int number) {
		System.out.println("Actual number :"+number);
		int revNum = 0;
		while(number != 0) {
			revNum = (revNum*10) + (number%10);
			number = number/10;
		}
		return revNum;
	}
	
	//trying to add '0' zero also to reverse number.. but while taking as input itself. it is not considering.
	public int revNum() {
		int number = 0;
		System.out.println("Please give number to reverse");
		Scanner sc = new Scanner(System.in);		
		number = sc.nextInt();
		int revNumber = 0;
		System.out.println("Actual number :"+number);
		List<Integer> numbers = new ArrayList<Integer>();
		while(number != 0) {
			number = number/10;
			numbers.add(number);
		}

		for(int i=0; i<numbers.size(); i++) {
			System.out.println("reverse number :"+numbers.get(i));
		}
		sc.close();
		return revNumber;
	}
	
	public static void main(String[] args) {
		ReverseANumber revNumber = new ReverseANumber();
		int reverseNumber  = revNumber.reverseNumber(12340);
		System.out.println("Reverse a number :"+reverseNumber);
		//int revNum = revNumber.revNum();
		//System.out.println("Reverse the number :"+revNum);
	}

}
