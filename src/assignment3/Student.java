package assignment3;

import java.util.Scanner;

public class Student
{

		
			String Sname;
			int id,sub1,sub2,sub3;
			Scanner scan= new Scanner(System.in);
			
			
			public void get()
			{
				System.out.println("Enter Student Id");
				id= scan.nextInt();
				System.out.println("Student id is "+ id);
			}
			
			public void getStuMarks()
			{
				System.out.println("Enter marks for Sub1");
				sub1= scan.nextInt();
				System.out.println("Marks of subject one is" +sub1);
				System.out.println("Enter marks for Sub2");
				sub2= scan.nextInt();
				System.out.println("Enter marks for Sub3");
				sub3= scan.nextInt();
			}
			public void totalMarks()
			{
				int totalmarks;
				totalmarks=sub1+sub2+sub3;
				System.out.println("Total marks are"+ totalmarks);
			}
			
			public static void main(String[] args) 
			{
				
				Student S =new Student();
				 
				S.get();
				S.getStuMarks();
				S.totalMarks();
						
			}

}


