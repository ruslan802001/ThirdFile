package Homework;

public class HW2 {

	public static int countVowels(String input) {
		int count = 0;
		for(int i = 0; i <= input.length(); i++) {
			if(input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' 
					|| input.charAt(i) == 'o' || input.charAt(i) == 'u'|| input.charAt(i) == 'A'||
					input.charAt(i) == 'E' || input.charAt(i) == 'I' || input.charAt(i) == 'O' || input.charAt(i) == 'U') {
				 count++;
			}
		}
		return count;
	}
}
