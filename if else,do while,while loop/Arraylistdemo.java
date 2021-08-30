package Presentation;
import java.util.ArrayList;

public class Arraylistdemo {

	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(79);
		a1.add(null);
		a1.add(null);
		a1.add(79);
		a1.add(2);
	
		System.out.println(a1.size());
		a1.remove(0);
		System.out.println(a1);
		a1.set(0,1);
		System.out.println(a1);
		System.out.println(a1.isEmpty());
		System.out.println(a1.contains(1));
		a1.removeAll(a1);
		System.out.println(a1);
		
		
	}

}
