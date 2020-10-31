package Homework;

public class HW7 {
	
	public static void main(String[] args) {
		
		int x = 2;
		String input = "String";
		
		if(input.length() >= x && x > 0) {
			System.out.println(input.charAt(x - 1));
		} else {
			System.out.println("Invalid index");
		}
	}

}
