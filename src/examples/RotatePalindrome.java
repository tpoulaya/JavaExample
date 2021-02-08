package examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotatePalindrome {

	public static void main(String[] args) throws Exception {
		String str = "SSTAT";
		System.out.println("Input :"+str);
		StringBuffer strBuff = new StringBuffer();
		for(int i=1; i<str.length(); i++){
			strBuff.append(str.toCharArray()[i]);
		}
		strBuff.append(str.toCharArray()[0]);
		
		System.out.println("Output :"+strBuff.toString());
		RotatePalindrome rtPalindrom = new RotatePalindrome();
		rtPalindrom.palindromProg(strBuff.toString());
		
		rotateMethod(str);
	}
	
	public static void rotateMethod(String strInput){
		List<String> strList = new ArrayList<String>();
		char ch[] = strInput.toCharArray();
		for(int i=0;i<ch.length;i++){
			strList.add(Character.toString(ch[i]));
		}
		//SSTAT
		System.out.println("Original list :"+strList.toString());
		
		Collections.rotate(strList, -1);
		//STATS
		System.out.println("Result list :"+strList.toString().replaceAll(", ", ""));
	}
	
	
	public void palindromProg(String strInput) throws Exception{
		String strRev = "";
		char ch[] = strInput.toCharArray();
		for(int i=strInput.length()-1; i >= 0 ;i--){
			strRev = strRev+ch[i];
		}
		
		//Object comparison...
		if(strInput.equals(strRev)){
			System.out.println("Palindrom");
		}else{
			System.out.println("Non Palindrom");
		}
	}
}
