package javaPracticeProgram;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ajay" ;

		String[] strarray = str.split("");
		
		
		for (int i = strarray.length-1; i>=0 ; i--) {
			System.out.print(strarray[i]);
		}
	}

}
