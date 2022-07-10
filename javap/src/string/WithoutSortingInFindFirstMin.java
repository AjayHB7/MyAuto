package string;

public class WithoutSortingInFindFirstMin {

	public static void main(String[] args) {
		int[] arr = {53,66,13,67,39,7,3,9};
		int max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (max<arr[i]) {
				max = arr[i];				
			}
		}
		
		int fmin = max;
		int smin = max;
		int tmin = max;	
		int frmin =max;
		
		for (int i = 0; i < arr.length; i++) {
			if (fmin>arr[i]) {
				frmin=tmin;
				tmin=smin;
				smin=fmin;
				fmin=arr[i];
			}else if (smin>arr[i]) {
				frmin=tmin;
				tmin=smin;
				smin=arr[i];
			} else if (tmin>arr[i]) {
				frmin=tmin;
				tmin=arr[i];
			} else if (frmin>arr[i]) {
				frmin=arr[i];
			}
		}
		System.out.println(fmin+" "+smin+" "+tmin+" "+frmin);
		

	}

}
