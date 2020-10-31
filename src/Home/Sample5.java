package Home;

import java.util.Scanner;

public class Sample5 {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Enter your number ");
		 
		int x = number.nextInt();
		if (IsPositive(x)) {
			System.out.println("Postive");
			
		}else {
			System.out.println("Negative");
		}
		
	}
	 public static boolean IsPositive(int x) {
		 if(x>0) {
			 
			 return true;
		 }return false;
	 }
	 
		 
	 }
	
	
		
	
	


