package Exceptions;

public class CustomExceptions {

	
	public static void main(String[] args) {
		// Handle custom exception
		try {
			checkTheGrade (200);
		} catch (IllegalGradeException e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		// Handle unchecked custom exception
		try {
		
		divide (12,1);  // Because I did not handle it, i get red error.
		} catch(DivideByOneException e){
			
			System.out.println(e.getMessage());
		}
	}
	
	// Use checked custom exception in a method
	public static void checkTheGrade (int grade) throws IllegalGradeException {
		
		if(grade<0|| grade >100 ) {
			throw new IllegalGradeException("Grades must be between 0 and 100");
			
		}
		
		System.out.println("Your grade is" + grade);
		
	}
	
	// Use unchecked custom exception in a method
	public static void divide(int x, int y) {
		
		if(y==1) {
			throw new DivideByOneException("Dividing a number by 1 gives the number itself.");
		}
		System.out.println(x/y);
	}
}

/*
 * When we crate "Custom Exception";
   
   A) For Checked Custom Exception
  
   1- Put "Exception" word at the end of the Custom Exception class name like IllegalGradeException
   2- Do not forget to extend "Exception" class
   3- Create constructor with a String parameter, and "super()" constructor call keyword
   
   B) For Unchecked Custom Exception
  
   1- Put "Exception" word at the end of the Custom Exception class name like IllegalGradeException
   2- Do not forget to extend "RuntimeException" class
   3- Create constructor with a String parameter, and "super()" constructor call keyword
 */

class IllegalGradeException extends Exception{
	
	public IllegalGradeException(String message) {
		super(message);
	}
}

class DivideByOneException extends RuntimeException {
	
	public DivideByOneException (String message) {
		super(message);
	}
}