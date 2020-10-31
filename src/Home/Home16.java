package Home;

public class Home16 {

	public static void main(String[] args) {
		
		String x = "glass";
		String y = "Glass";
		
		for(int i=0; i<y.length(); i++) {
			if(y.startsWith(x.substring(0,1))) {
				System.out.println("True");
			break;
			} else {
				System.out.println("False");
				break;
			}
		}

	}

}
