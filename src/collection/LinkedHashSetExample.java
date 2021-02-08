package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
	
	/*
	 *  - Unique.
	 *  - Insertion order.
	 *  - Can store null value.
	 * */
	public static void main(String[] args) {
		String nd = null;
		Set<String> strSet = new LinkedHashSet();
		strSet.add("d");
		strSet.add("a");
		strSet.add("a");
		strSet.add("a");
		strSet.add(nd);
		strSet.add("a");		strSet.add(nd);
		strSet.add("a");		strSet.add(nd);
		strSet.add("a");
		strSet.add(nd);
		strSet.add("");
		strSet.add("b");
		strSet.add("c");
		
		Iterator<String> itr = strSet.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
