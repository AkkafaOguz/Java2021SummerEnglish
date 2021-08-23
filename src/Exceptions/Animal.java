package Exceptions;

public abstract class Animal {    // an abstract class can have both abstract and concrete methods.
	                              // However a concrete class can not have an abstract method
	
	/*
	 * 1- Abstract methods can be put in abstract classes
	 * 2- Abstract classes can have both abstract and concrete methods
	 * 3- to create an abstract method a) put abstract keyword after access modifier
	 *                                 b) do not create method body
	 * 4- For abstract methods we can use public, default and protected modifiers but we can not use
	 *    private as access modifiers.
	 * 5- Abstract methods must be overridden by child classes. if you do not do that you will get CTE.
	 * 6- Just concrete child child classes must override abstract methods
	 * 7- We can not put abstract methods inside the concrete classes.
	 */
	
	public abstract void eat();
	
	public void drink() {          // concrete method
		
		System.out.println("Animals drink water");
	}

	
}
