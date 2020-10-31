package Home;

public class Home13 {

	public static void main(String[] args) {
		
		String x = "Toyota";
		
		for(int i=0; i<x.length(); i++) {
			char[] result = new char[x.length()];
			result[i] = x.charAt(i);
			System.out.println(result[i]);
			
		}
		
	}

}
