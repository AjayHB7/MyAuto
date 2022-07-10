package string;

public class ABAABBABABAB {
	public static void main(String[] args) {

		String str = "abbababababa";
		
		String a = "";		
		String b = "";
		String ab = "";
		
		for (int i = 0; i <str.length(); i++) {
			if (str.charAt(i)=='a') {
				a+= str.charAt(i);
			}else{
				b+=str.charAt(i);
			}
		}
		
//		System.out.println(a);
//		System.out.println(b);
		
		for (int i = 0; i < a.length(); i++) {
			ab += a.substring(i, i+2)+b.substring(i, i+2);
			i++;
			
		}
		System.out.println(ab);
		
		
		
		
		
		
		
		
	}
}
