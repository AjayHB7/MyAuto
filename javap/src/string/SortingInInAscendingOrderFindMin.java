package string;

public class SortingInInAscendingOrderFindMin {
	public static void main(String[] args) {
		int[] arr = {10,45,6,35,8,12};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
			}
		}
		
		//Ascending order finding min
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
		System.out.println("\n");
		System.out.println("First min "+arr[0]);
		System.out.println("Second min "+arr[1]);
		System.out.println("Third min "+arr[2]);
	}
}
