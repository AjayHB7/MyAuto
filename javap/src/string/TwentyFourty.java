package string;

import java.util.Scanner;

public class TwentyFourty {

	public static void main(String[] args) {	

		for(;;){
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Number");
			int num = scan.nextInt();

			if(num>40){
				System.out.println("red");
				break;
			};

			if(num>=0 && num<=20){
				System.out.println(num+" is in between 0 and 20");
			}else if (num>=20 && num<=40) {
				System.out.println(num+" is in between 20 and 40");
			}

		}

	}

}
