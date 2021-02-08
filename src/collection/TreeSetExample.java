package collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
	
	/*
	 * - Unique
	 * - No null value
	 * - Ascending order
	 * */

	public static void main(String[] args) {
		String ng = null;
		Set<String> strSet = new TreeSet<String>();
		strSet.add("E");
		strSet.add("");
		strSet.add("A");
		strSet.add("B");
		strSet.add("C");
		//strSet.add(ng);
		strSet.add("A");
		
		Iterator<String> itr = strSet.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}

}
