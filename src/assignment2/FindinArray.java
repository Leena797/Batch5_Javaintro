package assignment2;

public class FindinArray 
{

	public static void main(String[] args) 
	{
		
		int a[]= {50,60,30,70,80};
		int max=a[0];
		
		for ( int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		System.out.println("The highest number is"+ max);
		
	}

}
