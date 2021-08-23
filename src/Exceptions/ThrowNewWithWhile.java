package Exceptions;

import java.util.Scanner;

public class ThrowNewWithWhile {

	
public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		int age= 0;
		
		do {
			
			System.out.println("Lutfen yasinizi giriniz");
			age= scan.nextInt();
		
		try {
			setAge(age);
			
		}catch (IllegalArgumentException e) {
			
			System.out.println("Yasiniz negatif bir sayi olamaz!");
		
		}
	
		
		}while(age<0);
		
		System.out.println("Tesekkurler");
	}

	public static void setAge(int age) throws IllegalArgumentException {
		

		if(age<0) {
			
			throw new IllegalArgumentException();
		} else {
		
		System.out.println("Yasiniz: " + age);
		}
		
	}

}
