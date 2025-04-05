package assignment;

import java.util.Scanner;

public class Factorial_number {

	public static void main(String[] args) 
	{
		System.out.println("Enter number");
		
		Scanner scan=new Scanner(System.in);
		int num = scan.nextInt();	
		int i;
		for ( i=1;i<=num; i++);
		{
			num = num *i;
		}
		
		System.out.println("Factorial of number is"+ num);
		

	
	}
}

