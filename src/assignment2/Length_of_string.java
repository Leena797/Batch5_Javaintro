package assignment2;
import java.util.Scanner;

public class Length_of_string 
{
	

	public static void main(String[] args) 
	{
		
		String St1;
		int b;
		Scanner scan=new Scanner(System.in);
		
				System.out.println("Enter string");
		St1=scan.nextLine();
		b=St1.length();
		System.out.println("The length of string is "+ b);

	}

}
