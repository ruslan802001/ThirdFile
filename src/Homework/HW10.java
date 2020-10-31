package Homework;

public class HW10 {

	public static void main(String[] args) {
		
		String input1 = "Hello";
		String input2 = "World";
		
		for(int i = 0; i < input2.length(); i++) {
			if(input2.charAt(i) == input1.charAt(input1.length() - 1)) {
				System.out.println(input1 + " ends with contents of " + input2);
				break;
			}else if(i == input2.length() - 1) {
				System.out.println(input1 + " does not end with contents of " + input2);
			}
			
		}

	}

}
