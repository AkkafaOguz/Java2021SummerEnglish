package Constructors;

public class DersTekrariConstructors {
	
	String name;
	String yazar;
	int sayfa;
	String yayinEvi;
	int baski;
	int fiyat;
	
	static int satisSayisi=0;  // if you are sure about the value that you assign here, you should assign it to understandability of your code.           
	static int ciro=0;

	public static void main(String[] args) {

		
		DersTekrariConstructors kitap = new DersTekrariConstructors("Kendime Dusunceler","Marcus Aurelius", 144, "Is Bankasi", 11, 13);
		
		System.out.println("Kitap adi: " + kitap.name);
		System.out.println("Yazar: " + kitap.yazar);
		System.out.println("Kitabin sayfa sayisi: " + kitap.sayfa);
		System.out.println("Yayin Evi: " + kitap.yayinEvi);
		System.out.println("Kitap baski sayisi: " + kitap.baski);
		System.out.println("Fiyat: " + kitap.fiyat + "TL");
		
		System.out.println("Satilan kitap sayisi: " + satisSayisi);
		System.out.println("Gunluk ciro: " + ciro);
		

		DersTekrariConstructors kitap2 = new DersTekrariConstructors("Hizli ve Yavas Dusunme","Daniel Kahneman", "Kurgu", 56);
		
		System.out.println("Kitap adi: " + kitap2.name);
		System.out.println("Yazar: " + kitap2.yazar);
		System.out.println("Yayin Evi: " + kitap2.yayinEvi);	
		System.out.println("Fiyat: " + kitap2.fiyat + "TL");
		
		System.out.println("Satilan kitap sayisi: " + satisSayisi);
		System.out.println("Gunluk ciro: " + ciro);
		

	}
	
	
	public DersTekrariConstructors(String name, String yazar, int sayfa, String yayinEvi, int baski, int fiyat) {
		
		this.name=name;
		this.yazar=yazar;
		this.sayfa=sayfa;
		this.yayinEvi=yayinEvi;
		this.baski=baski;
		this.fiyat=fiyat;
		
		satisSayisi++;
		ciro+=fiyat;
	}
	

	public DersTekrariConstructors(String name, String yazar, String yayinEvi, int fiyat) {
		
		this.name=name;
		this.yazar=yazar;
		this.yayinEvi=yayinEvi;
		this.fiyat=fiyat;
		
		satisSayisi++;
		ciro+=fiyat;
		
	}
	
	

}
