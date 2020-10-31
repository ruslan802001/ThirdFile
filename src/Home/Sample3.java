package Home;

import java.util.Scanner;

public class Sample3 {

	public static void main(String[] args) {
		
	Scanner math = new Scanner(System.in);
	
	System.out.println("Insert your number");
	
	int number = math.nextInt();
	
	System.out.println("Insert your second number");
	
	int number2 = math.nextInt();
	
	int average = (number + number2)/2;
	System.out.println("The average number is " + average);
		

	}

}
