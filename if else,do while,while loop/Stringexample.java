package Presentation;

public class Stringexample {

	public static void main(String[] args)
	{
		String str="This is demo";
		String s1="a";
		String s2="A";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(str.subSequence(3, 9));
		System.out.println(str.substring(3));
		System.out.println(str.substring(3,11));
		System.out.println(str.replace("is", "was"));
		System.out.println(str.replaceFirst("is", "was"));
		System.out.println(str.replaceAll("is", "was"));
		System.out.println(str.indexOf("i"));
		System.out.println(str.startsWith("T"));
		System.out.println(str.endsWith("a"));
		int a=10;
		String s3=String.valueOf(a);
		System.out.println(s3);
		String s="sumanth";
		char[] c=s.toCharArray();
		System.out.println(c);
		System.out.println(str.repeat(3));
		
	}

}
