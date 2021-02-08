package examples;

public class FibonnaciSeriesRecursive {

	public static int n1=0, n2 =1, n3 =0;
	public static void main(String[] args) {
		int count = 10;
		System.out.print(n1+ " "+n2); 
		FibonnaciSeriesRecursive fb = new FibonnaciSeriesRecursive();
		fb.fibRec(count);
	}
	
	public void fibRec(int c){
		if(c > 0){
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" "+n3);
			fibRec(c-1);
		}
	}

}
