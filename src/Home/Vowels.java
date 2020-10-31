package Home;

public class Vowels {

	public static int vowels(String x) {
		
		int vowels = 0;
		for(int i=0; i<x.length(); i++) {
			if(x.charAt(i)=='a' || x.charAt(i)=='e' || x.charAt(i)=='i' || x.charAt(i)=='A' || x.charAt(i)=='E' || x.charAt(i)=='I') {
			vowels++;	
			}
		}
		return vowels;
	}

}
