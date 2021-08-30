package Presentation;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap2 {

	public static void main(String[] args) {
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(1, "hii");
		h.put(5, "hello");
		h.put(3,"good");
		
		Set<Map.Entry<Integer,String>> s=h.entrySet();
		for(Map.Entry<Integer,String> it:s)
		{
			System.out.println(it.getKey()+ "-->"+it.getValue());
		}

	}

}
