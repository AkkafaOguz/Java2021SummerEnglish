package Exceptions;

public class NullPointer {
	
	/*
	 * 1- NullPointerException is unchecked exception ==> RTE
	 * 2- When we try to get something which is null
	 * 3- We can not use "try block" alone
	 *    a)try + catch
	 *    b)try + multiple catch
	 *    c)try + catch (or multiple catch) + finally
	 *    d)try + finally
	 *    
	 * 4- We can use finally to close our file or database.
	 *    it will be executed in any condition in try block
	 *    it can cause some security problems
	 *    it means you will pay a lot to the cloud company.   

	 */

	public static void main(String[] args) {

		String str = null;
		
		try {
			
			System.out.println(24/0);
			System.out.println(str.length());// NullPointerException
			
		} catch (NullPointerException e) {
			System.out.println("Do not use length method for null objects");
		} catch(ArithmeticException e){
			System.out.println("Do not divide by zero!");
		} finally {
			System.out.println("Her kosulda calisir");
			System.out.println("Actigin data base'i kapatttim dostum!");
		}

		System.out.println("I love JAVA");
	}

}
