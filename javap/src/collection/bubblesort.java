package collection;

public class bubblesort {

	public static void main(String[] args)
	{
		int[]array1={50,9,71,3,8,55,123,2};
		Boolean flag=false;
		int n =array1.length;
		int temp;
		
		
		for (int i=0; i<n-1; i++) 
		{
			flag =false;
			for (int j = 0; j < n-1-i; j++)
			{
				if (array1[j]>array1[j+1])
				{
					temp= array1[j];
					array1[j]=array1[j+1];
					array1[j+1]=temp;
					flag=true;
				}
				
			}
			if (flag==false) 
			{
				break;
			}
		}
		System.out.println(array1[0]);

	}

}
