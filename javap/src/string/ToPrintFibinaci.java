package string;

public class ToPrintFibinaci {
	public static void main(String[] args) {
		
		int fib1 = 0;
		int fib2 = 1;
		int fib3 = 0;
		
		System.out.print(fib1+" "+fib2+" ");
		int n = 0;
		while(n<15){
			
			fib3=fib1+fib2;
			System.out.print(fib3+" ");
			fib1=fib2;
			fib2=fib3;
			n++;
		}
		
			
		
		
	}
}
