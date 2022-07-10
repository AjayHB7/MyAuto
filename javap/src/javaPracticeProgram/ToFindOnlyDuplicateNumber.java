package javaPracticeProgram;

import java.util.TreeSet;

public class ToFindOnlyDuplicateNumber {

	public static void main(String[] args) {

		int[] s = {4,3,1,7,4,2,3,5,1,1};

		//		System.out.println(s.length);

		for (int i = 0; i < s.length; i++) {
			int count = 0;
			for (int j = i+1 ; j < s.length; j++) {
				if(s[i]==s[j]){
					count++;
				}
			}

			// all with no duplicates
						if (count==0) {
							int count1=0;
							for (int j = 0; j < s.length; j++) {
								if(s[i]==s[j]){
									count1++;
								}
							}
							
							// only unique
							if(count1==1){
								System.out.println(s[i]);
							}
							
							
						}
						
						
						
						
						
						

//			// duplicates
//						if (count==1) {
//							System.out.println(s[i]);
//						}

			
			
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
//						
//						
//
//			TreeSet<Integer> set = new TreeSet<Integer>();
//
//			for (int i = 0; i < s.length; i++) {
//				set.add(s[i]);
//			}
//
//			for (Integer number : set) {
//				int count = 0;
//				for (int j = 0; j < s.length; j++) {
//					if (number==s[j]) {
//						count++;
//					}
//				}
//
//				// prints only unique 
////				if (count==1) {
////					System.out.println(number);
////				}
//
//				// prints only duplicates
////				if (count>1) {
////					System.out.println(number);
////				}
//				
//				// no duplicates
//				if (count>0) {
//					System.out.println(number);
//				}
//			}


		}
	}

}

