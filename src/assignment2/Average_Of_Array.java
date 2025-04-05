package assignment2;

public class Average_Of_Array {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] array= {1,2,3,4,5};
		int length=array.length;
		int sum=0;
		int i;
		
		for ( i =0; i<length;i++)
		{
			sum = sum + array[i];
		}
		System.out.println("The sum of array is" +" " + sum);
		int average = sum / length;
		System.out.println("The average of Array is "+ " "+ average);
	}

}
