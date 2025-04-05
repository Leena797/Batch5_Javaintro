package assignment2;

import java.util.Scanner;

public class Compare2Strings 
{

	public static void main(String[] args) 
	{
		
		
		
		String st1,st2;
		Scanner scan=new Scanner(System.in);
		               		
        System.out.println("Enter first string");	
        
        st1=scan.nextLine();
        System.out.println("First string is"+ st1);
        System.out.println("Enter another string");
        st2=scan.nextLine();
        System.out.println("Second string is"+ st2);
        if(st1.equalsIgnoreCase(st2))
        {
        	System.out.println("Strings are same");
        }	
        else
        {
        	System.out.println("Strings are not same");
        }
        }
        
	}


