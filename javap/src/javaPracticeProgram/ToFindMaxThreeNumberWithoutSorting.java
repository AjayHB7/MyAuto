package javaPracticeProgram;

public class ToFindMaxThreeNumberWithoutSorting {

	public static void main(String[] args) {
		int[] numsarr = {2,4,65,6,12,3,88};
		
		int firstmax = 0;
		int secondmax = 0;
		int thirdmax = 0;
		

		for (int i = 0; i < numsarr.length; i++) {
			if (firstmax<numsarr[i]) {
				firstmax = numsarr[i];
			}
		}
		for (int i = 0; i < numsarr.length; i++) {
			if (secondmax<numsarr[i] & firstmax!=numsarr[i]) {
				secondmax = numsarr[i];
			}
		}
		for (int i = 0; i < numsarr.length; i++) {
			if (thirdmax<numsarr[i] & firstmax!=numsarr[i] & secondmax!=numsarr[i]) {
				thirdmax = numsarr[i];
			}
		}		
		System.out.println(firstmax+" "+secondmax+" "+thirdmax);
	}
}
