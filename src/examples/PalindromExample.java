package examples;

public class PalindromExample {

	public static void main(String[] args) {
		String str = "MADAM";
		String rev = "";
		for(int i=str.length()-1; i>=0; i--){
			rev = rev + str.toCharArray()[i];
		}
		System.out.println(rev);
		if(str.equals(rev)){
			System.out.println("Palindrom string");
		}else{
			System.out.println("Non Palindrom string");
		}
	}

}
