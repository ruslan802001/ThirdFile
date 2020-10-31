package Home;

public class PasswordMethod {
	
	public static String pass(String x) {
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		if(x.length()<10) {
			return "Must have 10 character";
		} else { 
			for(int i=0; i<=x.length()-1; i++) {
				if(x.charAt(i) >=97 && x.charAt(i)<=122 || x.charAt(i)>=65 && x.charAt(i)<=90 ||x.charAt(i)>=48 && x.charAt(i)<=57) {
					a++;
					
				} else {
					return "Must consist of numbers and letters";
				}
		}
			
		}
		for(int i = 0; i<=x.length()-1; i++) {
			if(x.charAt(i) >=97 && x.charAt(i)<=122 || x.charAt(i)>=65 && x.charAt(i)<=90) {
				c++;
				
			}
		}
		 for(int i=0; i<=x.length()-1; i++) {
			
			 if(x.charAt(i)>=48 && x.charAt(i)<=57) {
				 b++;
			 }
			 
		 }
		 
		 
		 if(b>=2&&c>=6) {
			 return "Valid Password";
		 }else {
			 return "Must have 2 digits and 6 letters";
		 }
	}

}
