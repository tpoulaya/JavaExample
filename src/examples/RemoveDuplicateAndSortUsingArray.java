package examples;

import java.util.ArrayList;

public class RemoveDuplicateAndSortUsingArray {
	
	public static void main (String srgs[]) {
		int arr[] = {1,2,2,2,2,4,4,5,5,3,3,6,2,3,4,5};
		int x = arr.length;
		
		//x = removeDup(arr, x);
		
		ArrayList<Integer> arList = removeDupFromArray(arr, x);
		x = arList.size();
		for(int i=0; i<x ;i ++) {			
			System.out.print(arr[i] + " ");
		}
 	}
	
	//Not correct.....
	public static int removeDup(int arr[], int n) {
		
		if(n == 0||n==1) {
			return n;
		}
		int temp[] = new int[n];
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(arr[i] != arr[i+1] && temp[j] != arr[i]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n-1];
		
		for(int i=0; i<j ; i++) {
			arr[i] = temp[i];
		}
		
		return j;
	}
	//not correct.....
	public static int removeDuplicate(int arr[], int n){
		if(n==0 || n==1){
			return n;
		}
		
		for(int i=0,k=0; i<n-1; i++){
			if(arr[i] != arr[i+1]){
				System.out.println(arr[i] + "is not equal" + arr[i+1]);
				
			}else{
				System.out.println(arr[i] + "is equal" + arr[i+1]);
			}
		}
		return 0;
	}
	
	// it is also not working.....
	public static ArrayList<Integer> removeDupFromArray(int arr[], int sizeOfArray){
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		int temp = 0;
		for(int i=0; i <sizeOfArray; i++){
			for(int j=i+1; j<sizeOfArray; j++ ){
				if(arr[i] == arr[j]){
					i++;
				}else{
					temp = arr[i];
					//arrList.add(arr[i]);
				}
				break;
			}
			if(!arrList.contains(arr[i])){
				arrList.add(temp);
			}
		}
		return arrList;
	}
}
