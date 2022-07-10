package string;

public class WithoutSortingInFindFirstMax {
	public static void main(String[] args) {

		int[] arr = {5,4,3,2,1};

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (min>arr[i]) {
				min=arr[i];
			}
		}

		int fmax = min;
		int smax = min;
		int tmax = min;
		int frmax = min;

		for (int i = 0; i < arr.length; i++) {
			if (fmax<arr[i]) {
				frmax=tmax;
				tmax=smax;
				smax=fmax;
				fmax=arr[i];

			}else if (smax<arr[i]) {
				frmax=tmax;
				tmax=smax;
				smax=arr[i];

			}else if (tmax<arr[i]) {
				frmax=tmax;
				tmax=arr[i];

			}else if (frmax<arr[i]) {
				frmax=arr[i];
			}


		}

		System.out.println(fmax+" "+smax+" "+tmax+" "+frmax);


	}
}
