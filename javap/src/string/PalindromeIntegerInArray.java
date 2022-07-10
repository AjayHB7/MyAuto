package string;

public class PalindromeIntegerInArray {

	public static void main(String[] args) {
		int[] arr = {121,345,676,987};

		for (int i = 0; i < arr.length; i++) {

			int num = arr[i];
			int rev = 0;

			while(num>0){
				int rem = num%10;
				rev = rev*10+rem;
				num=num/10;				
			}

			if (rev==arr[i]) {
				System.out.println(arr[i]);
			}	
			

		}
	}

}
