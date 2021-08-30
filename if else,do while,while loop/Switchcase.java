package Presentation;

public class Switchcase {    //declare class name as Switchcase

	public static void main(String[] args) 
	{
		int number=50;                //declare a integer variable number and assign a value 20
		switch(number)            //apply switch case statements
		{
		case 10:
			System.out.println("10");//it will execute only when value is 10.
			break;
		case 20:
			System.out.println("20");//it will execute only when value is 20
			break;
		case 30:
			System.out.println("30");//it will execute only when value is 30.
			break;
			default:
				System.out.println("Not in 10,20 or 30");
			
		}

	}

}
