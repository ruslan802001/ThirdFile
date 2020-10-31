package Homework;

public class StringHW {

		
	public static String midchar(String input) {
		
		int position1;
		int position2;
		if(input.length()%2==0) {
			position1 = input.length()/2-1;
			position2 = 2;
		} else {
			position1 = input.length()/2;
			position2 = 1;
		}
		return input.substring(position1, position1 + position2);
	}

}
