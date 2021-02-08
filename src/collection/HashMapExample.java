package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	/*
	 * - Unique key
	 * - One null key
	 * - Ascending order
	 * 
	 * */
	public static void main(String[] args) {
		Map<String, String> hashMapTest = new HashMap<>();
		hashMapTest.put("*", "*");
		hashMapTest.put("", "");
		hashMapTest.put("c", "C");
		hashMapTest.put("d", "D");
		hashMapTest.put(null, null);
		hashMapTest.put("a", "A");
		hashMapTest.put("b", "B");
		
		for(Map.Entry<String, String> m : hashMapTest.entrySet()){
			System.out.println(m.getKey()+ " -- "+ m.getValue());
		}
	}

}
