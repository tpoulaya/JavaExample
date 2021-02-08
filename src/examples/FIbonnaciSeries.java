package examples;

public class FIbonnaciSeries {

	/* Fibonacci series : 0 1 1 2 3 5 8 13 21 34 */

	public static void main(String[] args) {
		int number = 10;
		int feb[] = new int [number];
		feb[0] = 0;
		feb[1] = 1;
		//To create finonacci series
		for(int i=2; i<feb.length; i++) {
			feb[i] = feb[i-1]+feb[i-2];
		}
		
		//To Print the series
		for(int i=0;i<feb.length;i++) {
			System.out.println(feb[i]+" ");
		}
	}
}
