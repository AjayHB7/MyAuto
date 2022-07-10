package poly;

public class child_one extends parent
{
	void sample1()
	{
		System.out.println("this is sample 1 in child_one ");
	}
	void sample3()
	{
		System.out.println("this is sample 3 in child_one ");
	}
	void sample7()
	{
		System.out.println("this is sample 7 in child_one ");

	}
	
	public static void main(String[]args) 
	{
	child_one c1=new child_one();
	c1.sample1();
	c1.sample2();
	c1.sample3();
	}


}
