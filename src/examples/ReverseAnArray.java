package examples;

public class ReverseAnArray {

	public static void main(String[] args) {
		int arr[] = {10,50,46,20,78,23};
		ReverseAnArray revArray = new ReverseAnArray();
		revArray.reverse(arr);
	}
	
	public void reverse(int a[]) {
		 int arrSize = a.length;
		 int s = arrSize;
		int b[] = new int [arrSize];
		for(int i=0; i<arrSize ;i++){
			b[s - 1] = a[i];
			s--;
		}
		
		for(int k=0; k<arrSize;k ++){
			System.out.print(b[k]+" ");
		}
	}
}
