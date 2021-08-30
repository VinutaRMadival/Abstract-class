package samplesss;

public class StudentComp implements Comparable<StudentComp>
{
 int rollno;
 String name;
 int age;
 
	public StudentComp(int rollno, String name, int age) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.age = age;
}

	@Override
	public int compareTo(StudentComp o) 
	{
		if(this.age==o.age)
			return 0;
		else if(this.age>o.age)
			return 1;
		else
			return -1;
	}
	

}
