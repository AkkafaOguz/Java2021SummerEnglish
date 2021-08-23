package Exceptions;

import java.util.Scanner;

/*
 * 1- we can use throws in method signature 
 * we can use throw inside the method body wherever we want
 * 2- after throws keyword we can type more than one exception, 
 * but when you use throw keyword you should type throw for every exception
 * 3- with throws keyword we use the name of the exception 
 * with throw keyword we use object
 */

public class ThrowNew {
	
	// IllegalArgumentException
	// unchecked exception. When we do not want some kind of entries for our code

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen yasinizi giriniz");
		int age= scan.nextInt();
		
		
		try {
			setAge(age);
		}catch (IllegalArgumentException e) {
			
			System.out.println("Yasiniz negatif bir sayi olamaz!");
		}
	
		
		
		
	}

	public static void setAge(int age) throws IllegalArgumentException {
		

		if(age<0) {
			
			throw new IllegalArgumentException();
		} else {
		
		System.out.println("Yasiniz: " + age);
		}
		
	}
}
