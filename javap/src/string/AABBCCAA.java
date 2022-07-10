package string;

public class AABBCCAA {

	public static void main(String[] args) {
		String str = "AABBCCAA";
		int j = 0;
		boolean flag = true;
		
		while(flag){

			for (char c ='A' ; c <= 'z'; c++) {
				int count = 0;
				for (int i = j; i < str.length(); i++) {
					if (str.charAt(i)==c) {
						count++;
						if (i==str.length()-1) {
							flag=false;
						}
					} else {
						j=i;
						break;
					}
				}

				if (count>0) {
					System.out.print(c+"="+count+" ");
				}


			}			
		}
	}
}
