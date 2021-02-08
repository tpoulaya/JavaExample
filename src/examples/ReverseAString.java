package examples;

public class ReverseAString {

	public static void main(String[] args) throws Exception {
		ReverseAString revString = new ReverseAString();
		String revStr = revString.reverseString("Today is my interview");
		System.out.println("Reverse string :" +revStr);
		
		revStr = revString.reverseWordByWordOfAString("Today is my interview");
		System.out.println("Reverse string :"+revStr);
	}
	
	public String reverseString(String str) {
		System.out.println("Actual string :"+str);
		String rev="";
		if(str.length() == 1) {
			return str;
		}else {
			for(int i = str.toCharArray().length-1 ; i >= 0 ;i--) {
				rev = rev + str.toCharArray()[i];
			}
		}
		return rev;
	}
	
	public String reverseWordByWordOfAString(String str) throws Exception{
		System.out.println("Actual String :"+str);
		String rev = "";
		if(str.contains(" ")){
			String arrString[] = str.split(" ");
			for(int i=0; i<arrString.length; i++){
				if(arrString[i].length() == 0){
					return str;
				}else{
					char chs[] = arrString[i].toCharArray();
					for(int j=chs.length-1; j>=0 ;j--){
						rev = rev + chs[j];
					}
					if(i>=0){
						rev = rev + " ";
					}
				}
			}
		}
		return rev;
	}
}
