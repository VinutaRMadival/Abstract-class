package samplesss;

import java.util.ArrayList;
import java.util.Iterator;


public class Iteratorss {

	public static void main(String[] args) {
		
		ArrayList<String> citynames=new ArrayList<String>();
		citynames.add("mumbai");
		citynames.add("goa");
		citynames.add("sirsi");
		Iterator iterator= citynames.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next()+" ");
		System.out.println();

	}

}
