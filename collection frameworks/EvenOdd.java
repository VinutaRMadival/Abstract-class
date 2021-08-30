package Presentation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class EvenOdd {

	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(15);
		li.add(20);
		li.add(25);
		li.add(30);
		li.add(100);
		li.add(60);
		li.add(110);
		li.add(215);
		li.add(230);
		//System.out.println(li);
		//System.out.println(5%2);
		
		Map<Integer,String> numberten =new HashMap<Integer,String>();
		for(int i=0;i<li.size();i++)
		{
		if(li.get(i)%10==0)
		{
		numberten.put(li.get(i),String.valueOf(li.get(i)));
		}
		
		//}
		/*System.out.println("\n\n\niteration:"+(i+1));
		System.out.println("printing even map elements");
		
		System.out.println("\n");
		System.out.println("printing odd map elements");*/
		
		}

		System.out.println(numberten);
		
		}
		
	}


