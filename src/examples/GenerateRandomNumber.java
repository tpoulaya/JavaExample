package examples;

import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		GenerateRandomNumber randNumber = new GenerateRandomNumber();
		randNumber.randomeNumber(2);
		System.out.println("++++++++++++++++++");
		randNumber.randomeNumber(4);
		System.out.println("++++++++++++++++++");
		randNumber.randomeNumber(5);
		System.out.println("++++++++++++++++++");
	}
	
	public void randomeNumber(int x){
		Random rand = new Random();
		for(int i=0;i<x;i++){
			System.out.println(rand.nextInt(10)); // 10 -> it represents 0-9 digit number.
		}
	}


}
