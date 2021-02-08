package examples;

public class PrimeOrNot {

	public static void main(String[] args) {
		PrimeOrNot prmObj = new PrimeOrNot();
		System.err.println("Prime or not :234 -"+prmObj.isPrimeNumber(234));
		System.err.println("Prime or not :12 -"+prmObj.isPrimeNumber(12));
		System.err.println("Prime or not :5 -"+prmObj.isPrimeNumber(5));
		System.err.println("Prime or not :7 -"+prmObj.isPrimeNumber(7));
		System.err.println("Prime or not :9 -"+prmObj.isPrimeNumber(9));
		System.err.println("Prime or not :11 -"+prmObj.isPrimeNumber(11));
		System.err.println("Prime or not :10 -"+prmObj.isPrimeNumber(10));
		
		System.out.println("Prime or not : 5 - "+prmObj.isPrimeUsingWhile(5));
		System.out.println("Prime or not : 7 - "+prmObj.isPrimeUsingWhile(7));
		System.out.println("Prime or not : 10 - "+prmObj.isPrimeUsingWhile(10));

	}
	
	public boolean isPrimeNumber(int prime) {
		for(int i=2; i<prime/2;i++) {
			if(prime%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public boolean isPrimeUsingWhile(int number){
		boolean flag = true;
		int i=2;
		while(i <= number/2){
			if(number%i == 0){
				flag = false;
				break;
			}
			++i;
		}
		return flag;
	}

}
