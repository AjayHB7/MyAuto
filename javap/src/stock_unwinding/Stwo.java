package stock_unwinding;

public class Stwo
{
	static void m4()
	{
		int a=1/0;
	}
	
	static void m3()
	{
		m4();
	}
	
	static void m2()
	{
		m3();
	}
	
	static void m1()
	{
		m2();
	}
	
	public static void main(String[] args)
	{
		System.out.println("program starts");
		try {
			m1();
		} catch (Exception e) {
			System.out.println(e+" is handled");
			e.printStackTrace();
		}
		System.out.println("program ends");

	}

}
