package assignment2;

public class SumofArray {

	public static void main(String[] args)
	{
		int[] array= {1,2,3,4,5};
		int length=array.length;
		int sum=0;
		int i;
		
		for ( i =0; i<length;i++)
		{
			sum = sum + array[i];
		}
		System.out.println("The sum of array is" +" " + sum);
		
	}

}
