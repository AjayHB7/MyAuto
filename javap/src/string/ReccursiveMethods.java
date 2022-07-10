package string;

public class ReccursiveMethods {

	static int n = 0;
	
	public static void p1() {	
		
		while(n<10){
			System.out.println(n);
			n++;		
			p1();
		}
	}

	public static void main(String[] args) {
//		p1();
		System.out.println(50+30+"string"+40+40+80);
		
		
		
		
		
		
	}
	
}
