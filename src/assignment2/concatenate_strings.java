package assignment2;

import java.util.Scanner;

public class concatenate_strings 
{

	public static void main(String[] args) 
	{
		
		String St1,St2;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Input first String");
		St1=sc.nextLine();
		System.out.println("Input second String");
		St2=sc.nextLine();
		System.out.println("Both strings together are"+St1+St2);
		
	}

}
