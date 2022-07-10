package collection;

import java.util.Scanner;

public class Segregating {

	public static void main(String[] args) 
	{
		Scanner String1 = new Scanner(System.in);
		System.out.println("please enter your alphanumeric with special character");
		String s1 = String1.next();
		String s2 = "" ;
		String s3 = "" ;
		String s4 = "" ;
		
		for (int i = 0; i < s1.length(); i++)
		{
			if (Character.isAlphabetic(s1.charAt(i)))
			{
				s2=s2+s1.charAt(i);
			}else if (Character.isDigit(s1.charAt(i))) 
			{
				s3=s3+s1.charAt(i);
				
			}else 
			{
				s4=s4+s1.charAt(i);
			}
			
		}
		
		//System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

}
