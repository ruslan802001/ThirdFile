package Home;

import java.util.Scanner;

public class Sample2 {

	public static void main(String[] args) {
		
		
		Scanner mike = new Scanner(System.in);
		System.out.println("Inser your name");
		
		String name = mike.nextLine();
		System.out.println("Hi " + name);
		System.out.println("Welcome!");
		
		System.out.println("How old are you " + name);
		int age = mike.nextInt();
		
		System.out.println("You are " + age+ " years old Good");
		
	}

}
