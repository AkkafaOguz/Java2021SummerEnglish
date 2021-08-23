package Constructors;

public class DersTekrariAnimal {

	
	String name;
	String cins;
	int yas;
	int mama;
	
	static int hayvanAdet=0;
	static int gunlukHarcananMamaKg=0;
	
	
	DersTekrariAnimal (int mama){
		
		this.mama=mama;
		
		hayvanAdet++;
		gunlukHarcananMamaKg+=mama;
	}
	

	DersTekrariAnimal (String name, String cins, int yas, int mama){
		
		this.name=name;
		this.cins=cins;
		this.yas=yas;
		this.mama=mama;
		
		hayvanAdet++;
		gunlukHarcananMamaKg+=mama;
	}
	

	DersTekrariAnimal (String name, String cins, int mama){
		
		this.name=name;
		this.cins=cins;
		this.mama=mama;
		
		hayvanAdet++;
		gunlukHarcananMamaKg+=mama;
	}
	
	
	
	

}
