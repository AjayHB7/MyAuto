package demo;

public class AL 
{
	static int accounts()
	{
		int M_sal=10000;
		int no_months=12;
		int AN_sal=M_sal*no_months;
		return AN_sal;
		
	}
	
	public static void main(String[]args) 
	{
	int bonus=20000;
	int x =accounts();
	int total=x+bonus;
	System.out.println("The total salary of sanju including bonus of this year is "+ total+"rs");
	}	
     
}

