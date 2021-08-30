package Presentation;

public class Ifelseladder {  // creating class Ifelseladder

	public static void main(String[] args)
	{
		int i=30;          //declare a integer variable and initializing with value 20
		
		if(i==10)          //condition 1
		{
			System.out.println("i is 10\n");//  if condition 1 is true then print the value 10
		}
		else if(i==15)     //condition 2
		{
			System.out.println("i is 15\n");//if condition 2 is true then print the value 15
		}
		else if(i==20)     //condition 3
		{
			System.out.println("i is 20\n");  //if condition 3 is true then print the value 20
		}
		else
		{
			System.out.println("i is not present\n");//if condition is not met then print this statement
		}

	}

}
