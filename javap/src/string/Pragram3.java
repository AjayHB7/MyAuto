package string;

public class Pragram3 {
	public static void main(String[] args) {
		// input = "abcdefgh"; 
	   // output = "hbgdfega";
		
		String str = "abcdefgh";
		String rstr = "";
		String nstr = "";
		
		
		for (int i = 0; i < str.length(); i++) {
			
			rstr = str.charAt(i)+rstr;
			
		}
		System.out.println(rstr);
		
		
		for (int i = 0; i < rstr.length(); i++) {
			
			nstr+=rstr.charAt(i)+""+str.charAt(i+1);
			i++;			
		}
		
		System.out.println(nstr);
		
	}
}
