package samplesss;

import java.util.Comparator;

public class RollComparator implements Comparator<EmpComparator> 
{

	@Override
	public int compare(EmpComparator o1, EmpComparator o2)
	{
		if(o1.rollno==o2.rollno)
		{
		return 0;
	    }
		else if(o1.rollno>o2.rollno)
		{
			return 1;
		}
		else
			return -1;

}
}
