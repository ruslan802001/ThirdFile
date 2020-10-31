package Home;

//import java.applet.Applet;
public class Sample1 {

	public static void main(String[] args) {
		
		PasswordMethod check = new PasswordMethod();
		check.pass("digit");
		System.out.println(check.pass("digit545454"));
	

}
}
