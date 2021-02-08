package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	/*
	 *  - Unique.
	 *  - Ascending order.
	 *  - Can store null value.
	 * */
	public static void main(String[] args) {
		String nd = null;
		Set<String> strSet = new HashSet<String>();
		strSet.add("d");
		strSet.add("a");
		strSet.add("e");
		strSet.add("a");
		strSet.add(nd);
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
