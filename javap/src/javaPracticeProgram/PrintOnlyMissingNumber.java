package javaPracticeProgram;

public class PrintOnlyMissingNumber {

	public static void main(String[] args) {
		int[] arr = {5,7,9,10,11,20};
		int length = arr[arr.length-1];
//		System.out.println(length);
		
		for (int i = 0; i < length; i++) {
			boolean flag = true;
			for (int j = 0 ; j < arr.length; j++) {
				if (i==arr[j]) {
					flag = false;
				}
			}
			
			if (flag==true) {
				System.out.print(i+" ");
			}
		}
		
		
		

	}

}
