package string;

public class FindingCommonInArray {

	public static void main(String[] args) {
		int[] arr1 = {1,2,4,6,7,1};
		int[] arr2 = {4,5,8,1,3,9,1,1,1,1};
		int[] arr3 = {4,5,2,8,1,4,4,4,4};


		for (int i = 0; i < arr1.length; i++) {
			int countp =0;

			for (int p = i+1; p < arr1.length; p++) {
				if (arr1[i]==arr1[p]) {
					countp++;
				}
			}


			int count = 0;
			if (countp==0) {
				for (int j = 0; j < arr2.length; j++) {
					if (arr1[i]==arr2[j]) {
						count++;
					}
				}

			}

			if (count>=1) {
				int count1 =0;
				for (int k = 0; k < arr3.length; k++) {
					if (arr1[i]==arr3[k]) {
						count1++;
					}					
				}

				if (count1>=1) {
					System.out.println(arr1[i]);
				}
			}

		}

	}

}
