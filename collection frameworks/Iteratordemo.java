package samplesss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteratordemo {

	public static void main(String[] args)
	{
		List<Integer> l=new ArrayList<Integer>();
		l.add(8);
		l.add(3);
		l.add(2);
		l.add(9);
		System.out.println(l);
		Iterator<Integer> itr=l.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println();
	}
}
		/*for(int i=0;i<=l.size();i++)
		{
			System.out.println(l.get(i));
		}
		Iterator<Integer> ir=l.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		
		
	}*/


