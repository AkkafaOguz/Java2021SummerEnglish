package Constructors;

/*
Java knows, classes are for Object Creation, to create objects we need "constructors", because of that
when you create a class Java creates a constructor automatically.

Java gives you a default constructor, which is invisible inside the class.

If you want you can create your own constructor as well.

Note: Constructors are not methods because they do not have return types.
      In the interview, DO NOT use "constructor method"
      Constructors are constructor
      
Note: Constructor names must be same with the class name.

Interview Question:
What is the difference between "constructor" and "method"?
1)Constructors do not have return type but methdos have
2)Methods may have any name as method name but constructors must have class name as constructor name

Note: When you create a class Java gives you default constructor but if you create any constructor Java deletes the default one

Note: Default constructor is constructor without parameters like "public Constructors01(){ }" 
*/

public class Constructors {

	


	
	public static void main(String[] args) {
		
	}
	
	public int add(int a, int b) {
		return a + b;
	}
	
	//How can we create a constructor?
	//Access Modifier   +  Class Name() + { }
	public Constructors() {
		
	}
	
	public Constructors(int a) {
	
	}
	
	public Constructors(int a, String s) {
		
	}
	
	public Constructors(char a, double d, String s) {
		
	}


}
