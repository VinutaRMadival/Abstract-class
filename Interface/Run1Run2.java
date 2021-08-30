package javaday3;


public class Run1Run2 extends Object implements Run1,Run2 { //create class Sample2Interface that extends Object class and implements two interfaces

	@Override
	public void display() {                                      //overriding display method
		System.out.println("this is overriding display method");
	}

	@Override
	public void test() {                                        //overriding test method
		System.out.println("this overriding test method");
	}

}
