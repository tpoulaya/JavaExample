package examples;

public class ArmstrongNumber {

	public static void main(String[] args) {
		ArmstrongNumber armStrognObj = new ArmstrongNumber();
		armStrognObj.isArmstrongNumber(153);
		armStrognObj.isArmstrongNumber(222);
		armStrognObj.isArmstrongNumber(371);
	}
	
	public boolean isArmstrongNumber (int number) {
		int rem = 0;
		int temp = 0;
		int n = number;
		while(number != 0) {
			temp = number%10; //reminder
			number = number/10; //quotient
			rem = rem + (temp*temp*temp);
		}
		if(rem == n) {
			System.out.println("Armstrong");
		}else {
			System.out.println("Not a armstrong");
		}
		return false;
	}
}
