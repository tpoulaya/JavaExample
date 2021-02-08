package examples;

public class BinaryNumber {

	public static void main(String[] args) {
		BinaryNumber bn = new BinaryNumber();
		System.out.println("0000 is binary:"+bn.isBinaryNumber(0000));
		System.out.println("00000 is binary:"+bn.isBinaryNumber(00000));
		System.out.println("01010 is binary:"+bn.isBinaryNumber(01010));
		System.out.println("0101 is binary:"+bn.isBinaryNumber(101));
		System.out.println("1010 is binary:"+bn.isBinaryNumber(1010));
		System.out.println("11111 is binary :"+bn.isBinaryNumber(11111));
		System.out.println("22222 is binary:"+bn.isBinaryNumber(22222));
		System.out.println("10320 is binary:"+bn.isBinaryNumber(10320));
	}
	
	public boolean isBinaryNumber(int binary) {
		boolean status = true;
		while(status) {			
			if(binary == 0) {
				break;
			}else {
				int tmp = binary%10;
				if(tmp > 1) {
					status = false;
					break;
				}
				binary = binary/10;
			}
		}
		return status;
	}

}
