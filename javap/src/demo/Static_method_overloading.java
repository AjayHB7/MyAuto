package demo;

public class Static_method_overloading 
{
	 void add(String a,String b)
	{
		System.out.println(a+" love "+b);
	}
	
	void add(int c,int d,int e)
	{
		System.out.println(c +d +e + " numbers");
	}
	 void add(int f,String g)
	{
		System.out.println("my age is "+ f + g );
	}

	public static void main(String[] args) 
	{
		Static_method_overloading smo =new Static_method_overloading();
		smo.add("I", "YOU");
		smo.add(1, 2, 3);
		smo.add(26," YEARS");
		
	}

}
