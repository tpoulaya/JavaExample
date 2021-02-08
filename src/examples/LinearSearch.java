package examples;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[] = {6,7,2,4,6,2,8,9,1};
		LinearSearch lSearch = new LinearSearch();
		System.out.println(lSearch.findIndex(arr, 1));
		System.out.println(lSearch.findIndex(arr, 4));
		System.out.println(lSearch.findIndex(arr, 6));
	}
	
	public int findIndex(int arr[], int number) {
		if(arr != null){
			int len = arr.length;
			int i = 0;
			while(i < len){
				if(arr[i] == number){
					return i;
				}else{
					i = i+1;
				}
			}
		}
		return -1;
	}

}
