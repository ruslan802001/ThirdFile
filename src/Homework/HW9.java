package Homework;

public class HW9 {

	public static void main(String[] args) {

     String input = "Hello";
     
     char one = 'l';
     char two = 'l';
     char three = 'l';
     
     for(int i = 0; i < input.length(); i++) {
    	 if(input.charAt(i) == one) {
    		 if(input.charAt(i + 1) == two) {
    			 if(input.charAt(i + 2) == three) {
    				 System.out.println("This string contains the given sequence.");
    				 break;
    			 }
    		 }
    	 } else if(i == (input.length()-1)) {
    		 System.out.println("This string does not contain the given sequence.");
    	 }
     }

	}

}
