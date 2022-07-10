package javaPracticeProgram;

public class ToFindFirstMinThreeNumberWithoutSorting {

	public static void main(String[] args) {
		int[] numarr={9,44,6,3,7,42,75,23,21};
		
	
		int maxnum = 0;
		
		for (int i = 0; i < numarr.length; i++) {
			if(maxnum<numarr[i]){
				maxnum = numarr[i];
			}
		}
		int firstmin = maxnum;
		int secondmin = maxnum;
		int thirdmin = maxnum;
		
		for (int i = 0; i < numarr.length; i++) {
			if(firstmin>numarr[i]){
				firstmin = numarr[i];
			}
		}
		for (int i = 0; i < numarr.length; i++) {
			if(secondmin>numarr[i] & numarr[i]!=firstmin){
				secondmin = numarr[i];
			}
		}
		for (int i = 0; i < numarr.length; i++) {
			if(thirdmin>numarr[i] & numarr[i]!=firstmin &numarr[i]!=secondmin){
				thirdmin = numarr[i];
			}
		}
		
		System.out.println(firstmin+"  "+secondmin+"  "+thirdmin);
	}

}
