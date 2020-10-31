package Homework;

public class HW3 {

	 public static int sumDigits(long n) {
			int result = 0;
			
			while(n > 0) {
				result += n % 10;
				n /= 10;
			}
			
			return result;
		}
}
