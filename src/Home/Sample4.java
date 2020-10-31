package Home;

import java.util.Scanner;

public class Sample4 {

	public static void main(String[] args) {
		
		Scanner name = new Scanner(System.in);
		System.out.println("Enter your number");
		int x = name.nextInt();
		if(isPositive(x)) {
			System.out.println("The number is Positive");
		} else {
			System.out.println("The number is Negative");
		}
		
		
	}
	 private static boolean isPositive(int number) {
		 if(number>0) {
			 return true;
		 } return false;
	 }
	
   
	}
	


