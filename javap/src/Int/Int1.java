package Int;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Int1 {

	public static void main(String[] args) {
		String s = "I am am AJAY";
		String s2 = "I am am hasha";
		
		String s3 = s+" "+s2;
		
		String[] s3arr = s3.split(" ");
		
		LinkedHashSet<String> lset = new LinkedHashSet<>();
		
		for (int i = 0; i < s3arr.length; i++) {
			lset.add(s3arr[i]);
		}
		
		System.out.println(lset);
		
		
		
		
		
		
		
		
//		for (int i = 0; i < s3arr.length; i++) {
//			
//			int count = 0;
//			
//			for (int k = i+1; k < s3arr.length; k++) {
//				
//				if (s3arr[i].equals(s3arr[k])) {
//					count++;
//				}				
//			}
//			
//			if (count==0) {
//				System.out.println(s3arr[i]);
//			}
//			
//			
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		
//
//		String[] strarr = s.split(" ");
//		
//		
//
//		LinkedHashSet<String> lset = new LinkedHashSet<String>();
//		
//		LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();
//
//		for(int i = 0 ; i < strarr.length; i++){
//			
//			lset.add(strarr[i]);
//			
//		}		
//		
//		for (String string : strarr) {
////			System.out.println(string.hashCode());
//		}
//
//
//		
//		
//		for(String sss : lset){
//			System.out.print(sss);
//
//			int count = 0;
//
//			for(int j = 0; j< strarr.length; j++){
//
//				if(strarr[j].equals(sss)){
//					count++	;
//				}
//
//			}
//			
////			System.out.println(sss+"="+count);
//			hm.put(sss, count);
//			
//		}
//		System.out.println(hm);
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
