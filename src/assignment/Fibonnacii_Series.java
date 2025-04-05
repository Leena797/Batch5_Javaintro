package assignment;

public class Fibonnacii_Series {

	public static void main(String[] args) 
	{
	
		int firstnum=0;
		int secondnum=1;
		int nextnum=0;
		
		for ( int i=1; i<=10; i++)
		{
			System.out.println(firstnum + ",");
			nextnum = firstnum + secondnum;
		}
		
		System.out.println(nextnum);
	}

}
