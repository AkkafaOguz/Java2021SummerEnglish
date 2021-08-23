package Exceptions;

public class Lion extends Animal {
	
	@Override
	public void eat() {
		System.out.println("Lions eat meat");
		
	}
	
	@Override
	public void drink() {
		super.drink();
		System.out.println("same as lions");
	}

}
