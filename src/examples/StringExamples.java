package examples;

public class StringExamples {

	public static void main(String[] args) {
		StringExamples strExm = new StringExamples();
		
		strExm.evenPositionShouldConvertToUpper("Poulaya Reddy");
		
		strExm.sentenceConvertion("tippana poulaya reddy");
		
		strExm.interChangeTheWordsInSentance("Poulaya", "Reddy");
		
		System.out.println(strExm.compareBothString("abcd", "dcba"));
	}
	
	//Convert even character into uppercase and odd into lower case of a word.
	public void evenPositionShouldConvertToUpper(String str){
		StringBuffer strBuf = new StringBuffer();
		char ch[] = str.toCharArray();
		for(int i=0; i<ch.length; i++){
			char c = ch[i];
			if(i%2 == 0){
				c = Character.toUpperCase(ch[i]);
			}else{
				c = Character.toLowerCase(ch[i]);
			}
			strBuf.append(c);
		}
		System.out.println("Converted String :"+strBuf);
	}
	
	//Odd words convert it to uppercase and even words covert it into reverse. 
	public void sentenceConvertion(String str){
		System.out.println("Inpur is :"+str);
		String[] words = str.split(" ");
		String output = "";
		int counter = 1;
		for(String word : words){
			if(counter % 2 == 1){
				output = output+word.toUpperCase()+ " ";
			}else{
				output = output+ new StringBuffer().append(word).reverse()+ " ";
			}
			counter++;
		}
		System.out.println("Output is :"+output);
	}
	
	//Inter change the words using substring.
	public void interChangeTheWordsInSentance(String a, String b){
		System.out.println("Before changing :"+a + " " +b);
		a = a+b;
		b = a.substring(0, b.length());
		a = a.substring(b.length(), a.length());
		System.out.println("After changing :"+a+ " "+b);
		
	}
	
	//Compare both strings a and b
	public boolean compareBothString(String a, String b) {
		boolean flag = true;
		char[] ch = a.toCharArray();
		for(char cha : ch){
			if(b.indexOf(cha) == -1){
				flag = false;
				break;
			}
		}
		return flag;
	}
}