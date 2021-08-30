package javaday3;



public class MainclassInterface {

	public static void main(String[] args) {
		
    FirstInterface.display();             //calling the static method
    HthirdInterface s1=new HthirdInterface();  //creating the the object of  SampleInterface 
    GsecondInterface d1=new GsecondInterface();      //creating the the object of  DemoInterface 
    d1.view();                               //calling view method through d1 reference variable
    d1.test();                                  //calling test method through d1 reference variable
    s1.view();                                //calling view method through s1 reference variable
    s1.test();                                //calling test method through s1 reference variable
	}

}
