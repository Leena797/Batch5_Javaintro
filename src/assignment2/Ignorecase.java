package assignment2;

import java.util.Scanner;
public class Ignorecase 
{

	public static void main(String[] args) 
	{
		Scanner keyb= new Scanner(System.in);
		
		System.out.println("Are you resident ?");
		String ans=keyb.next();
		
		if (ans.equalsIgnoreCase("yes"))
		{
			System.out.println("Entry is free");
		}
		else
		{
			System.out.println("Book ticket");
		}
		 
		

	}

}
