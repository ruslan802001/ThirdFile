package Home;

public class Home3 {

	public static int digits(int x) {
		
		int result = 0;
		while(x>0) {
			result = result + x%10;
		x/=10;
		}
		return result;
	}
}
