package examples;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountDuplicateCharacters {
	
	public static void main(String args[]) {
		CountDuplicateCharacters dup = new CountDuplicateCharacters();
		dup.findDupCharactersInString("abababashjsjannasjjsjs");
	}
	
	/*
	 * 
	 *  a-- :>6
		b-- :>3
		s-- :>5
		j-- :>5
		n-- :>2
	 * */
	
	public void findDupCharactersInString(String str) {
		Map<Character, Integer> dupMap = new HashMap<Character, Integer>();
		char[] chrs = str.toCharArray();
		for(Character ch : chrs) {
			if(dupMap.containsKey(ch)) {
				dupMap.put(ch, dupMap.get(ch)+1);
			}else {
				dupMap.put(ch, 1);
			}
		}
		Set<Character> keys = dupMap.keySet();
		for(Character ch : keys) {
			if(dupMap.get(ch) > 1) {
				System.out.println(ch + "-- :>" + dupMap.get(ch));
			}
		}
	}
}
