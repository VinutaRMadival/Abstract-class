package Presentation;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapdemo {

	public static void main(String[] args)
	{
		TreeMap<Integer,String> h1=new TreeMap<Integer,String>();
		h1.put(4, "hii");
		h1.put(2, "hello");
		h1.put(7, "good");
		h1.put(6, "morning");
		System.out.println(h1);
		System.out.println(h1.get(4));

	}

}
