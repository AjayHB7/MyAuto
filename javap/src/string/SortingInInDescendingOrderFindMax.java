package string;

public class SortingInInDescendingOrderFindMax {

	public static void main(String[] args) {
		int[] arr = {3,45,75,23,5,9};

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}			
		}
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
		System.out.println("\n");
		System.out.println("First max "+arr[0]);
		System.out.println("Second max "+arr[1]);
		System.out.println("Third max "+arr[2]);
		
	}

}
