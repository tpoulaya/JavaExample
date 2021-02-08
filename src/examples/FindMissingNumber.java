package examples;

public class FindMissingNumber {

	public static void main(String[] args) {
		int a[] = {1,2,5,4,6};
		int miss = getMissingNo(a);
		System.out.println(miss);
	}
	
	 // Function to find missing number 
    static int getMissingNo (int a[]) { 
        int i, total;
        int n = a.length;
        total  = (n+1)*(n+2)/2;    
        for ( i = 0; i< n; i++) 
           total -= a[i]; 
        return total; 
    }
}
