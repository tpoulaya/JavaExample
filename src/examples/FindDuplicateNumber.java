package examples;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindDuplicateNumber {

	public static void main(String[] args) {
		FindDuplicateNumber findDupNumber = new FindDuplicateNumber();
		List<Integer> number = findDupNumber.addDupNum(10);
		System.out.println("Numbers are :");
		for(int i=0;i<number.size();i++) {
			System.out.println(number.get(i));
		}
		
		findDupNumber.findDupNum(number);
	}
	
	public List<Integer> addDupNum(int numRange) {
		List<Integer> numbers = new ArrayList<Integer>();
		for(int i=0;i<numRange;i++) {
			numbers.add(i);
		}
		numbers.add(1);
		numbers.add(4);
		numbers.add(1);
		numbers.add(4);
		return numbers;
	}
	
	public void findDupNum(List<Integer> num) {
		Map<Integer, Integer> countDupNum = new HashMap<Integer, Integer>();
		for(int i=0; i<num.size();i++) {
			int j = num.get(i); // Value
				if(countDupNum.containsKey(j)) {
					countDupNum.put(j, countDupNum.get(j)+1);
				}else {
					countDupNum.put(j, 1);
				}
		}
		Set<Integer> count = countDupNum.keySet();
		for(int n : count) {
			countDupNum.get(n);
			//System.out.println("Keys :"+countDupNum.get(n)+" / Value :"+Integer.valueOf(n));
			if(countDupNum.get(n) >= 3) {
				System.out.println("Match found :"+ n + " are duplicate");
			}
		}
	}

}
