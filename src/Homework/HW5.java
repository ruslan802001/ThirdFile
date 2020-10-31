package Homework;

public class HW5 {
	
	public static String checkSign(int input) {
		if(input > 0) {
			return "positive";
		} else if (input < 0) {
			return "negative";
		} else {
			return "zero";
		}
	}

}
