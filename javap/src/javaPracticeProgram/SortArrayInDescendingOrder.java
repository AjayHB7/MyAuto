package javaPracticeProgram;

public class SortArrayInDescendingOrder {

	public static void main(String[] args) {
		int[] arr = {10, 4, 5, 8, 3, 2};

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		// To find max and min numbers in the array

		// max
		System.out.println("max number in the array is "+ arr[0]);

		// min
		System.out.println("min number in the array is "+ arr[arr.length-1]);

		// sum of first three max
		int sumofmax = 0 ;
		for (int i = 0; i < 3; i++) {
			sumofmax += arr[i];
		}
		System.out.println("sum of first three maximum's = "+sumofmax);

		// sum of first three min
		int sumofmin = 0;
		for (int i = arr.length-3 ; i < arr.length; i++) {
			sumofmin += arr[i];
		}
		System.out.println("sum of first three minimum's = "+sumofmin);
		
	}

}