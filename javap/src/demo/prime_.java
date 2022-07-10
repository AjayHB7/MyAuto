package demo;

import java.util.LinkedHashSet;

public class prime_ {

	public static void main(String[] args) {
		// to find sum of given number
//		int num = 111111;
//		int sum = 0;
//		while(num>0){
//			int rem = num%10;
//			sum+=rem;
//			num = num/10;
//		}
//		System.out.println(sum);
		
		// to find pindilm
		int num = 121;
		int num1 = num;
		int rev=0;
		
	    while(num>0){
	    	int rem = num%10;
	    	rev = rev*10+rem;
	    	num = num/10; 
	    }
	    
	    if (num1==rev) {
			System.out.println("number is pendiam");
		}



	}


}
