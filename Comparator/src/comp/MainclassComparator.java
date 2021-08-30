package samplesss;

import java.util.ArrayList;
import java.util.Collections;

public class MainclassComparator {

	public static void main(String[] args) 
	{
		ArrayList<EmpComparator> al=new ArrayList<EmpComparator>();
		al.add(new EmpComparator("vinuta",50,67) );
		al.add(new EmpComparator("Apoorva",45,85) );
		al.add(new EmpComparator("bavana",42,21) );
		al.add(new EmpComparator("Shwetha",31,29) );
		Collections.sort(al,new AgeComparator());
		for(EmpComparator e:al)
		{
			System.out.println(e.name+" "+e.age+" "+e.rollno);
		}
		System.out.println();
		Collections.sort(al,new RollComparator());
		for(EmpComparator e:al)
		{
			System.out.println(e.name+" "+e.age+" "+e.rollno);
		}
		
		

	}

}
