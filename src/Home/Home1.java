package Home;

public class Home1 {

	public static String Middle(String x) {
		
		int position1=0;
		int position2=0;
		
		if(x.length()%2==0) {
			
			position1 = x.length()/2-1;
			position2 = 2;
			
			
		} else {
			position1=x.length()/2;
			position2=1;
		}
		return x.substring(position1, position2+position1);
		
	}

}
