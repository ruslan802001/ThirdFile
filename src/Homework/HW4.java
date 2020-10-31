package Homework;

public class HW4 {
	
	public static String checkPass(String input) {
		if(input.length() > 10) {
			int score = 0;
			int digits = 0;
			for(int i = 0; i < input.length(); i++) {
				if(input.charAt(i) == 'a' || input.charAt(i) == 'b' || input.charAt(i) == 'c' ||
						input.charAt(i) == 'd' || input.charAt(i) == 'e' || input.charAt(i) == 'f' ||	
						input.charAt(i) == 'g' || input.charAt(i) == 'h' || input.charAt(i) == 'i' ||
						input.charAt(i) == 'j' || input.charAt(i) == 'k' || input.charAt(i) == 'l' || 
						input.charAt(i) == 'm' || input.charAt(i) == 'n' || input.charAt(i) == 'o' || 
						input.charAt(i) == 'p' || input.charAt(i) == 'q' || input.charAt(i) == 'r' || 
						input.charAt(i) == 's' || input.charAt(i) == 't' || input.charAt(i) == 'u' || 
						input.charAt(i) == 'v' || input.charAt(i) == 'w' || input.charAt(i) == 'x' || 
						input.charAt(i) == 'y' || input.charAt(i) == 'z' || input.charAt(i) == '1' || 
						input.charAt(i) == '2' || input.charAt(i) == '3' || input.charAt(i) == '4' || 
						input.charAt(i) == '5' || input.charAt(i) == '6' || input.charAt(i) == '7' || 
						input.charAt(i) == '8' || input.charAt(i) == '9' || input.charAt(i) == '0' ) {
					score++;
				} else { return "Password must consist of only letters and numbers.";
				}
			
			} 
			for(int j = 0; j < input.length(); j++) {
				if( input.charAt(j) == '1' || 
						input.charAt(j) == '2' || input.charAt(j) == '3' || input.charAt(j) == '4' || 
						input.charAt(j) == '5' || input.charAt(j) == '6' || input.charAt(j) == '7' || 
						input.charAt(j) == '8' || input.charAt(j) == '9' || input.charAt(j) == '0') {
					digits++;
				}
			} if(digits < 2) {
				return "Password must contain at least 2 digits.";
			}
			
		} else { return "Password must have at least 10 characters.";
		}		
			
		return	"Valid password.";
	}	
		
}


