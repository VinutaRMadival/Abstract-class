package exception;

public class Multicatch {

	public static void main(String[] args) {
		try
		{
			int a[]=new int[5];
			System.out.println(a[10]);
			a[5]=30/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("arithmetic exception occurs here");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array exception occurs");
		}
		catch(Exception e)
		{
			System.out.println("parent exception occurs");
		}

	}

}
