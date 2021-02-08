package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
	
	/*
	 *  - Holds duplicate.
	 *  - Follow insertion order.
	 *  - Can't store null value.
	 * */

	public static void main(String[] args) {
		String ns = null; // Null value
		List<String> listString = new ArrayList<String>();
		listString.add("X");
		listString.add("A");
		listString.add("A");
		listString.add("B");
		listString.add("C");
		listString.add("D");
		listString.add("");
		listString.add("");
		listString.add("");
		//listString.add(ns); // Can't store any null value - java.lang.NullPointerException
		listString.add("E");
		listString.add(1, "a");
		listString.add("A");
		
		Iterator<String> itr = listString.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next().toString());
		}
	}

}
