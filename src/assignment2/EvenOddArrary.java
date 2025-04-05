package assignment2;

public class EvenOddArrary
{

	public static void main(String[] args) 
	{
		int arr[]={2,6,7,8,9,3};
		
		System.out.println("The ODD numbers are");
		for ( int i=0;i<arr.length;i++)
		{
			if(arr[i]%2 !=0)
			{
				
				System.out.println(arr[i]);
			}
			  
		}
		System.out.println("The Even numbers are");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				
				System.out.println(arr[i]);
			}
			
		}
		
	}

}
