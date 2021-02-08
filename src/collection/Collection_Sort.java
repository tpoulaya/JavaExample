package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Collection_Sort {

	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<>();
		ArrayList<String> arrSortedList = new ArrayList<>();
		
		arrList.add("H");
		arrList.add("X");
		arrList.add("F");
		arrList.add("D");
		arrList.add("A");
		arrList.add("B");
		
		arrSortedList.addAll(arrList);
		
		Collections.sort(arrSortedList);
		
		System.err.println(arrList);
		System.out.println(arrSortedList);
		
	}

}
