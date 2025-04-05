package assignment2;

public class DuplicatesStringsinArray {

	public static void main(String[] args) 
	{
		
		String arr[]= {"java","C","C++","Python","java"};
		
		boolean flag=false;
		
		for (int i =0;i<arr.length;i++)
		{
			for (int j=1;j<arr.length;j++)
			{
			if(arr[i]==arr[j])
			{
				System.out.println("Found duplicate Element ");
				flag=true;
			}
			}
		}

	}

}
