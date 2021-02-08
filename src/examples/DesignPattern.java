package examples;

public class DesignPattern {

	public static void main(String[] args) {
		DesignPattern dp = new DesignPattern();
		dp.designOne(5);
		
		dp.pyramidStars(5);
		
		dp.numberPattern(10);
		
		dp.digitPattern(10);
		
		dp.numberIncrementalPattern(10);
	}
	
	/*	Start pattern align to right.
	 
	* 
	* * 
	* * * 
	* * * * 
	* * * * * 
	
	*/
	public void designOne(int number) {
		for(int i=0;i<number;i++){
			for(int j=0;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}	
	}
	
	/*	Number pattern
	1 
	1 2 
	1 2 3 
	1 2 3 4 
	1 2 3 4 5 */
	public void numberPattern(int number) {
		for(int i=0;i<number;i++){
			int num=1;
			for(int j=0;j<=i;j++){
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}	
	}
	
	/* Incremental pattern...
	1 
	2 3 
	4 5 6 
	7 8 9 10 
	*/
	public void numberIncrementalPattern(int number) {
		int num=1;
		for(int i=0;i<number;i++){
			for(int j=0;j<=i;j++){
				System.out.print(num+" ");
				num = num + 1;
			}
			System.out.println();
		}	
	}
	
	/* Digit pattern
	1 
	2 2 
	3 3 3 
	4 4 4 4 
	5 5 5 5 5 */
	public void digitPattern(int number) {
		for(int i=1;i<number;i++){
			//int num=1;
			for(int j=1;j<=i;j++){
				System.out.print(i+" ");
				//num++;
			}
			System.out.println();
		}	
	}
	
	/*	Pyramid design by stars
	 
	    * 
	   * * 
	  * * * 
	 * * * * 
	* * * * *
	
	*/

	
	public void pyramidStars(int number) {
		for(int i=0;i<number;i++){
			//This for loop generate space till the last index
			for(int j=number-i; j>1; j--){
				System.out.print(" ");
			}
			//This for loop print number of star for row wise.
			for(int j=0; j<=i; j++){
				System.out.print(" * ");
			}
			//This will break the line and cursor place to the next line.
			System.out.println();
		}
	}
}
