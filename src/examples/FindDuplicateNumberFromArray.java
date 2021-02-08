package examples;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateNumberFromArray {

	public static void main(String[] args) {
		FindDuplicateNumberFromArray findDupNumber = new FindDuplicateNumberFromArray();
		int arrDup[] = {1,2,1,2,1,2,2,5,8,5,6,4,5};
		System.out.println("Numbers are :");
		for(int i=0;i<arrDup.length;i++) {
			System.out.println(arrDup[i]);
		}
		
		findDupNumber.findDupNum(arrDup);
	}
	
	
	public void findDupNum(int arr[]) {
		Map<Integer, Integer> countDupNum = new HashMap<Integer, Integer>();
		for(int i=0; i<arr.length;i++) {
			int j = arr[i]; // Value
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
			if(countDupNum.get(n) >= 2) {
				System.out.println("Match found :"+ n + " are duplicate");
			}
		}
	}
}
