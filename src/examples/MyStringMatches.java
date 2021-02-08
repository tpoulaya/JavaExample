package examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyStringMatches {

	public static void main(String[] args) {
		MyStringMatches mystrng = new MyStringMatches();
		mystrng.isStringNumber("642");
		mystrng.isStringNumber("3hfd642");
		mystrng.isStringNumber("1dv642");
		mystrng.isStringNumber("642vvvv");
		mystrng.isStringNumber("642./w;l");
		mystrng.isPatternMatching("Poul is my name");
		mystrng.isPatternMatching("Poulaya is my name");
		mystrng.isPatternMatching("Paul is my name");
	}
	
	public void isStringNumber(String no){
		System.out.println(no.matches("(\\d)"));
	}
	
	public void isPatternMatching(String str){
		Pattern ptrn = Pattern.compile("Poul", Pattern.CASE_INSENSITIVE);
		Matcher match = ptrn.matcher(str);
		if(match.find()){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
	}

}
