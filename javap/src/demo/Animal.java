package demo;

public class Animal {

	void makeNoise()
	{
		
	}
	
	void liveIn()
	{
		
	
	}
	
	public static void main(String[] args) 
	{
		Animal x =new Lion();
		x.makeNoise();
		x.liveIn();
		if(x instanceof Lion);
		{
		Lion y=(Lion)x;
		y.eat();
		}
	}
}

