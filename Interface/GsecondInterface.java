package javaday3;



public class GsecondInterface implements FirstInterface   //create a class DemoInterface that implements the properties by using implements keyword
{

	@Override
	public void test() {  //overriding the test method             
		System.out.println("this is demo class overriding test method");
	}

}
