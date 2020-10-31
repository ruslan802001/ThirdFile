package Homework;

public class HW1 {

//	public static char middleChar(String input) {
//			int stringLength = input.length();
//			int middle = stringLength/2;
//			char midChar = input.charAt(middle);
//					return midChar;
//		}
	
	public static String middleString(String input) {
		
		int position;
		int position2;
		
		if(input.length() % 2 == 0) {
			
			position = input.length() / 2 -1;
			position2 = 2;
			
 		} else {
 			position = input.length() / 2;
 			position2 = 1;
 		}
		return input.substring(position, position + position2);
	}
   
	
}
