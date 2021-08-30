package samplesss;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort {

	public static void main(String[] args)
    {
	ArrayList<StudentComp> al=new ArrayList<StudentComp>();
	al.add(new StudentComp(101,"vinuta",23));
	al.add(new StudentComp(106,"Anjali",27));
	al.add(new StudentComp(105,"Harsha",21));
    Collections.sort(al);
    for(StudentComp o:al)
    {
    	System.out.println(o.rollno+" "+o.name+" "+o.age);
    }
	}

}
