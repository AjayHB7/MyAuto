package string;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("please enter the number you want to check");
		int num = scan.nextInt();
		
		
		
		
		if ((num>1 && num%2!=0)|| num==2) {
			System.out.println("the entered number is prime number");
		}else{
			System.out.println("entered number is not a prime number");
		}
	

	}
}
