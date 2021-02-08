package collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
	/*
	 * - Unique key
	 * - One null key
	 * - Insertion order
	 * 
	 * */
	public static void main(String[] args) {
		Map<String, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("*", "*");
		linkedHashMap.put("", "");
		linkedHashMap.put("c", "C");
		linkedHashMap.put("d", "D");
		linkedHashMap.put(null, null);
		linkedHashMap.put("a", "A");
		linkedHashMap.put("b", "B");
		
		for(Map.Entry<String, String> m : linkedHashMap.entrySet()){
			System.out.println(m.getKey()+ " -- "+ m.getValue());
		}
	}

}
