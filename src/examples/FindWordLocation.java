package examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindWordLocation {

	public static void main(String[] args) {
		String title = "HiHowAreYou Hi Welcome to India";
		String find = "Hi";
		FindWordLocation fwd = new FindWordLocation();
		fwd.findLocation(title, find);
	}
	
	public void findLocation(String actStr, String toFind){
		int count = 0;
		Pattern p = Pattern.compile(toFind);
		Matcher m = p.matcher(actStr);
		while(m.find()){
			System.out.println("Starts at :"+m.start()+" Ends at :"+m.end());
			count++;
		}
		System.out.println("Count :"+count);
	}
}
