package collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	/*
	 * - Unique key
	 * - No null key and value
	 * - Ascending order
	 * 
	 * */
	public static void main(String[] args) {
		Map<String, String> treeMap = new TreeMap<>();
		treeMap.put("*", "*");
		treeMap.put("", "");
		treeMap.put("c", "C");
		treeMap.put("d", "D");
		//treeMap.put(null, null); // No null key and value.
		treeMap.put("a", "A");
		treeMap.put("b", "B");
		
		for(Map.Entry<String, String> m : treeMap.entrySet()){
			System.out.println(m.getKey()+ " -- "+ m.getValue());
		}
	}

}
