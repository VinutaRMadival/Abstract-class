package Presentation;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("hello");
		System.out.println(sb.capacity());
		sb.append("vinuta javaa");
		System.out.println(sb.capacity());
		StringBuffer sb1=new StringBuffer("Vinuta Java");
		StringBuffer sb2=new StringBuffer("Vinuta Java");
		System.out.println(sb1.equals(sb2));
		StringBuffer sb3=new StringBuffer(100);
		System.out.println(sb3.capacity());
		sb3.append("hello");
		sb3.trimToSize();
		System.out.println(sb3.capacity());
		
	}

}
