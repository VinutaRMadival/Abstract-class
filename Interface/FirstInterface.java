package javaday3;

public interface FirstInterface{//declare a interface name as Run
	
		public void test();        //abstract method
		public static void display()      //static method
		{
			System.out.println("this is display method");
		}
		public default void view()         //nonstatic method
		{
			System.out.println("this defualt method of view");
		}
		

}
