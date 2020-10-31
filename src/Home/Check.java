package Home;

public class Check {
	
	public static void main(String[] args) {
		
		
		Home1 letter = new Home1();
		letter.Middle("x");
		System.out.println(letter.Middle("apple"));
		
		PassMethod test = new PassMethod();
		test.parol("sdhfjsj12");
				System.out.println(test.parol("sdhfjsj12"));
				
				Vowels vow = new Vowels();
				System.out.println(vow.vowels("Apple"));
				
				Home3 math = new Home3();
				System.out.println(math.digits(1256));
				
				Home4 pass = new Home4();
				System.out.println(pass.Password("computera///"));
	}

}
