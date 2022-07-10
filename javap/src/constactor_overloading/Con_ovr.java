package constactor_overloading;

public class Con_ovr
{
	 Con_ovr(String c, int d) 
	{
		System.out.println(c+" number "+d);
	}
	 Con_ovr(int d, String c) 
	{
		this("hello",27);
		System.out.println(d+" hi 27 "+c);
	}
	 Con_ovr(int q, int w, int e) 
	{
		this(13,"where have you been");
		System.out.println(q + w+ e+" all are number");
	}
	Con_ovr(String o) 
	{
		this(1, 2, 3);
		System.out.println("start "+o);
	}
	
	public static void main(String[] args)
	{
		new Con_ovr("ok");
	}

}
