package assignment;

import java.util.Scanner;

public class Greatest_number {
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number");
		int n = scanner.nextInt();
		System.out.println(n);
		System.out.print("Enter number");
		int m = scanner.nextInt();
		System.out.println(m);
		System.out.println("Enter number");
		int o = scanner.nextInt();
		System.out.println(o);
		
		if (n > m && n > o)
		{
			System.out.println("The bigger is"+ n);
		}
		else if( m > n && m > o)
		{ 
		System.out.println("The bigger num is" + m);
		}
		else
		{
			System.out.println("The bigger number is"+ o);
		}
	}
		

}
