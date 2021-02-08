package examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertListToArray {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");

        String[] array = new String[list.size()];
        array = list.toArray(array);
        
        System.out.println(Arrays.toString(array));
        
        for(String s : array){
        	System.out.println(s);
        }
	}

}
