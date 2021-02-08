package examples;
import java.util.ArrayList;
import java.util.List;

public class PrintTwoMaximumNumber {

	static int nums[] = {0,6,4,7,8,9,9,8, 10};
	public static void main(String[] args) {
		PrintTwoMaximumNumber ptmn = new PrintTwoMaximumNumber();
		List<Integer> number = ptmn.removeDup(nums);
		System.out.println("removed duplicate" +number);
		int [] arrayNum = new int[number.size()];
		for(int i=0; i< arrayNum.length ; i++) {
			arrayNum[i] = number.get(i);
		}
		ptmn.twoMaximumNumber(arrayNum);
	}
	
	public void twoMaximumNumber(int nums[]) {
		int firstMax = 0;
		int secondMax = 0;
		for(int n:nums) {
			if(firstMax < n) {
				secondMax = firstMax;
				firstMax = n;
			}else if(secondMax < n) {
				secondMax = n;
			}
		}
		System.out.println("First max :"+firstMax);
		System.out.println("Second Max :"+secondMax);
	}
	
	public List<Integer> removeDup(int nums[]) {
		List<Integer> removeDuplicate = new ArrayList<Integer>();
		for(int i=0;i<nums.length; i++) {
			if(removeDuplicate.contains(nums[i])) {
				//do nothing
			}else {
				removeDuplicate.add(nums[i]);
			}
		}
		return removeDuplicate;
	}
}
