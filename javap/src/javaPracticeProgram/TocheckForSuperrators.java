package javaPracticeProgram;

public class TocheckForSuperrators {

	public static void main(String[] args) {
		String str = "i (thisis)khkr{nbdjfbjvbjkenfdakbfjhbjvhbjhvbf[dcsjbsjsbv]}";

		boolean flag = false;

		for (int i = 0; i < str.length(); i++) {


			if (str.charAt(i)=='{') {
				if(str.charAt(i)=='{'){
					flag=false;
					for (int j = i+1 ; j < str.length(); j++) {
						if (str.charAt(j)=='}') {
							flag = true;
							break;
						}                    
					}
					if (flag==false) {
						break;
					}
				}
				
			}else if(str.charAt(i)=='('){
					flag=false;
					for (int j = i+1 ; j < str.length(); j++) {
						if (str.charAt(j)==')') {
							flag = true;
							break;
						}
					}
					if (flag==false) {
						break;
					}
				}else if(str.charAt(i)=='['){
					flag=false;
					for (int j = i+1 ; j < str.length(); j++) {
						if (str.charAt(j)==']') {
							flag = true;
							break;
						}
					}
					if (flag==false) {
						break;
					}
				}

			}
		
		
		
		if (flag==true) {
			System.out.println("string is valid");
		}else{
			System.out.println("string is invalid");
		}

	}

}
