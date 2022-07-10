package demo;

import java.util.Scanner;

public class prime 
{
	static public void  main(String args[])
	{
	boolean flag=false;
	Scanner input = new Scanner(System.in);
	System.out.println("enter the number you want to check");
	int num=input.nextInt();
	
	if(num<=1)
	{
		System.out.println(num+ " is not a prime number");
	}else
	{
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				System.out.println(num+ " is not a prime number");
				break;
				
			}else{
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
