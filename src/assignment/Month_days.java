package assignment;

import java.util.Scanner;

public class Month_days {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter number between 1-12");
		int n = scan.nextInt();
		
		int days;
		switch(n)
		{
		case 1:
			System.out.println("31 Days in Jan" );
			break;
		case 2:
			System.out.println("28 Days in Feb" );
			break;
		case 3:
			System.out.println("30 Days in March" );
			break;
		case 4:
			System.out.println("31 Days in April" );
			break;
		case 5:
			System.out.println("30 Days in May" );
			break;
		case 6:
			System.out.println("31 Days in June" );
			break;
		case 7:
			System.out.println("30 Days in July" );
			break;
		case 8:
			System.out.println("31 Days in Aug" );
			break;
		case 9:
			System.out.println("30  Days in Sep" );
			break;
		case 10:
			System.out.println("31 Days in Oct" );
			break;
		case 11:
			System.out.println("30 Days in Nov" );
			break;
		case 12:
			System.out.println("31 Days in Dec" );
			break;
		
			
		}
	}

	
}
