package Homework;

public class HW6 {
	
	public static void main(String[] args) {
		
		int x = 4;
		
		int[] by = new int[11];
		System.out.println("Multiplication table for " + x + ".");
		for(int i = 1; i < 11; i++) {
			by[i] = x * i;
			
			System.out.println(x + " * " + i + " = " + by[i]);
			
		}
		
	}
	

}
