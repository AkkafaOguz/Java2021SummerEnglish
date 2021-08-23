package Constructors;

import java.util.Scanner;

public class StudentRunner {

	public static void main(String[] args) {

		
		do {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen adinizi giriniz: ");
		String name= scan.nextLine();
		System.out.println("Lutfen soyadinizi giriniz: ");
		String surname= scan.nextLine();
		System.out.println("Lutfen kayit oldugunuz yili giriniz: ");
		int year= scan.nextInt();
		System.out.println("Lutfen lise mezuniyet puaninizi giriniz: ");
		int grade= scan.nextInt();
	
		Student std1= new Student(name, surname, year, grade);	
		
		System.out.println("Ogrenci kayit islemini bitirmek icin Q'ya devam etmek icin herhangi bir tusa basiniz: ");
		char q= scan.next().toUpperCase().charAt(0);
		if (q=='Q') {
			break;
		}
		
		}while(true);
		

	}

}
