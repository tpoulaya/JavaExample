package examples;

public class SumOfANumber {

	int sum = 0;
	public static void main(String[] args) {
		SumOfANumber sumNumObj = new SumOfANumber();
		int sum = sumNumObj.sumOfNum(777);
		System.err.println(sum);
	}
	
	public int sumOfNum(int number) {
		if(number == 0) {
			return sum;
		}else{
			sum += number%10;
			sumOfNum(number/10);
		}
		return sum;
	}

}
