package stock_unwinding;

import java.util.Scanner;

public class sone {

	public static void main(String[] args) 
	{
		Boolean flag= false;
		Scanner s = new Scanner(System.in);
		System.out.println("enter your number");
		int num = s.nextInt();
		
		if (num<=1) 
		{
			System.out.println(num+" is not a prime number");
			
		} else 
		{
			for (int i = 2; i < num; i++) 
			{
				if(num%i==0)
				{
					System.out.println(num+" is not a prime number");
					break;
				}else 
				{
					flag=true;
				}	
			}
			if(flag==true)
			{
				System.out.println(num+" is a prime number");
			}

		}
		
		
	}

}
