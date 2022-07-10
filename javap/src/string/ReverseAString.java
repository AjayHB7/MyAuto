package string;

public class ReverseAString {

	public static void main(String[] args) {
		String str = "hi my name is ajay";
		
		String rev = "";
		
		for (int i = str.length()-1; i >=0; i--) {
			rev += str.charAt(i);
		}
		System.out.println(rev);
		
		
	}
	

}
