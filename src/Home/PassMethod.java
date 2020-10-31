package Home;

public class PassMethod {

	
	public static String parol(String x) {
		 
		int a = 0;
		int b = 0;
		
		
		if(x.length()<10) {
			return "Must have 10 characters";
		}
		else {
			for(int i=0; i<=x.length(); i++) {
				if(x.charAt(i)>=97 && x.charAt(i)<=122 || x.charAt(i)>=65 && x.charAt(i)<=98 || x.charAt(i)>=48 && x.charAt(i)<=57) {
					a++;
				}else {
					return "Must consist of letters and digits";
				}
			}
		}
		for(int i=0; i<=x.length(); i++) {
			if(x.charAt(i)>=48 && x.charAt(i)<=57) {
				b++;
			}
			
		}if(b>=2) {
				return "Valid Password";
				
			} else {
				return "Must have 2 digits";
			}
	}
}
