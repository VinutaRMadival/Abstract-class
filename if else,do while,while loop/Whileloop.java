package Presentation;

public class Whileloop {     //define a class as Whileloop

	public static void main(String[] args) {
		int number=5;     //declare a integer variable and assign value as 5.
		long fact=1;
		int i=1;//declare a long variable fact and assign the value as 1.
		while(i<=number)
		{
			fact=fact*i;//statement
			i++;       //Increment operation
		}
		System.out.println("factorial of "+number+" is: "+fact);//print factorial of a number.
	}

}
