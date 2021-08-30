package samplesss;

import java.util.Comparator;

public class AgeComparator implements Comparator<EmpComparator> 
{

	@Override
	public int compare(EmpComparator o1, EmpComparator o2)
	{
		if(o1.age==o2.age)
		{
		return 0;
	    }
		else if(o1.age>o2.age)
		{
			return 1;
		}
		else
			return -1;

}
}
