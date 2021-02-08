package examples;

public class PrimeNumberInARange {

	public static void main(String[] args) {
		PrimeNumberInARange pr = new PrimeNumberInARange();
		pr.primeNumberInRange(100);
	}
	
	public void primeNumberInRange(int number){
		int count = 0;
		for(int i=1; i<=number;i++){
			for(int j=2;j<=i/2; j++){
				if(i%j == 0){
					count++;
					break;
				}else{
					count = 0;
				}
			}
			if(count == 0 && i != 1){
				System.out.print(i + " ");
			}
		}
	}
}
