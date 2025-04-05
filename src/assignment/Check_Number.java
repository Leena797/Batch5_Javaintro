

package assignment;

import java.util.Scanner;
public class Check_Number 
{

	public static void main(String[] args) 
	
	{
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any number : ");
		
		int n = scanner.nextInt();
		System.out.println(n);
		if ( n >= 0)
		{
			System.out.println("Positive");
		}
		else
		{
			System.out.println("Negative");
		}
	}
		
}


