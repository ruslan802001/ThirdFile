package Home;

public class Home10 {

	public static void main(String[] args) {
		
		String x = "building";
		String y = "horse";
		
		for(int i = 0; i<y.length(); i++) {
			
			if(y.charAt(i)==x.charAt(x.length()-1)) {
				System.out.println("true");
				break;
			}
			if(i==y.length()-1) {
				System.out.println("False");
			}
		}

	}

}
