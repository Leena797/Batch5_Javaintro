package assignment;

import java.util.Scanner;

public class Multiplication_table {

	public static void main(String[] args)
	{
		int number;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number");
		number= scan.nextInt();
		System.out.println(number);
		for ( int i=1; i<=10;i++)
		{
			System.out.println(i*number);
		}

	}

}
