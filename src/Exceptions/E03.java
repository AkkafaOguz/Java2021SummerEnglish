package Exceptions;

public class E03 {
	
	/*
	 * 
	 * 1- ArrayIndexOutOfBoundException is an unchecked exception ==> RTE
	 * 2- When we try to get unexisting index of an array
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
	
		// ArrayIndexOutOfBoundException
		
//		String s[]= {"Selen", "Zeki", "Bahar"};
//		
//		System.out.println(s[0]);
//		
//		try {
//			System.out.println(s[6]);
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Lutfen array'inin uzunlugunu kontrol et!");
//		}
		
		/*
		  1- ClassCastException is an unchecked exception ==> RTE
		  2- When we try to cast a data type into another one which is not supported
		
		*/
//		Object o = 43;
//		
//		String number =  (String) o; 
		
		// NumberFormatException
		
		String s1 = "123";
		int num1 = Integer.parseInt(s1);
		System.out.println(num1+6);
		
		
		String s2= "2e4r5t";
		
		try {
			
			int num2= Integer.parseInt(s2);
			System.out.println(num2);
		} catch (NumberFormatException e) {
			System.out.println("Olmaz baba olmaz");
		}
		
		/*
		 * 1- NumberFormatExceptionis an unchecked exception ==> RTE
		 * 2- When we try to convert undigit characters to the integer by using parseInt
		 */
		
		

	}

}
