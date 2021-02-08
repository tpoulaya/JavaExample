package examples;
import java.util.Arrays;

public class RemoveAnElementFromArray {
	public static void main(String[] args) {
		RemoveAnElementFromArray rm = new RemoveAnElementFromArray();
		rm.removeArray();
		rm.removeArrayUsingAnotherArray();
	}
	
	public void removeArray() { 
		int arr[] = {6,2,3,4,5};
		int removeIndx = 1;
		for(int i = removeIndx; i<arr.length-1; i++){
			arr[i] = arr[i+1];
			break;
		}
		System.out.println("Output :"+Arrays.toString(arr));
	
	}
	
	public void removeArrayUsingAnotherArray() {
		int arr[] = {6,7,3,4,5};
		int removeIndx = 2;
		int remArr[] = new int[arr.length-1];
		for(int i=0, k=0; i<arr.length; i++) {
			if(i == removeIndx) {
				continue;
			}else {
				remArr[k++] = arr[i];
			}
		}
		System.out.println("Output 1: "+Arrays.toString(remArr));
	}
}
