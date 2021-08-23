package Constructors;

public class DersTekrariAnimalRunner {

	public static void main(String[] args) {

		

		DersTekrariAnimal hayvan1 = new DersTekrariAnimal (1);
		System.out.println("Tuketilen mama: " + hayvan1.gunlukHarcananMamaKg + "kg");
		DersTekrariAnimal hayvan2 = new DersTekrariAnimal (1);
		System.out.println("Tuketilen mama: " + hayvan2.gunlukHarcananMamaKg + "kg");
		DersTekrariAnimal hayvan3 = new DersTekrariAnimal ("Feraye", "Sokak Kedisi", 2 , 1);
		System.out.println("Hayvanin adi: " + hayvan3.name + "\nCinsi : " + hayvan3.cins + "\nYasi: " + hayvan3.yas + "\nTuketilen mama: " + hayvan2.gunlukHarcananMamaKg + "kg");
		DersTekrariAnimal hayvan4 = new DersTekrariAnimal ("Firuze", " Mavi Rus", 1 , 2);
		System.out.println("Hayvanin adi: " + hayvan4.name + "\nCinsi : " + hayvan4.cins + "\nYasi: " + hayvan4.yas + "\nTuketilen mama: " + hayvan4.gunlukHarcananMamaKg + "kg");
		DersTekrariAnimal hayvan5 = new DersTekrariAnimal ("Filoki", " Sokak Kedisi", 3);
		System.out.println("Hayvanin adi: " + hayvan5.name + "\nCinsi : " + hayvan5.cins + "\nTuketilen mama: " + hayvan5.gunlukHarcananMamaKg + "kg");

		System.out.println(DersTekrariAnimal.hayvanAdet);
	}

}
