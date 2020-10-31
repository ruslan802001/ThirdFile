package Home;

public class Home9 {

	public static void main(String[] args) {
		
		String x = "monday";
		char one = 'o';
		char two = 'n';
		char three = 'd';
		
		for(int i=0; i<x.length(); i++) {
			if(x.charAt(i)==one) {
				if(x.charAt(i+1)==two) {
					if(x.charAt(i+2)==three) {
						System.out.println("contains");
					}
				}
			}
		}
		

	}

}
