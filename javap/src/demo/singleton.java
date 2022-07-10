package demo;

public class singleton 
{
	private static singleton s;
	
	private singleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static singleton get()
	{
		if(s==null)
		{
			s=new singleton();
		}
		return s;
	}

}
