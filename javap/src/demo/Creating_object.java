package demo;

public class Creating_object {
	
	static String a ="hgdsjgdjh";

	void add()
	{
	System.out.println("addition");	
	}
	 
	void sub()
	{
	System.out.println("subtraction");
	
	}
	static void mul()
	{
		System.out.println("static multiplication");
	}

	
	public static void main(String[] args)
	{
		
		Creating_object RV =new Creating_object();
		 RV.add();
		 RV.sub();
		 System.out.println(a);
		 mul();
		 
	}

}
