package Constructors;

public class Student {

	String name;
	String surname;
	int year;
	int grade;
	
	static String id;
	static int counter=1000;  // burayi static yaptim cunku buradaki degisikliklerin tum objeler (ogrenciler) icin gecerli olmasini istiyorum.
	static int ogrenciSayi = 0;
	
	
	
	public Student(String name, String surname, int year, int grade) {
	
		this.name = name;
		this.surname = surname;
		this.year = year;
		this.grade = grade;
		
		setId();
		
		System.out.println(ogrenciSayi+ ". ogrenci ==> " + "\nOgrencinin Adi: " + name + "\nOgrencinin Soyadi: " + surname +
				"\nKayit Oldugu Yil: " + year + "\nMezuniyet Puani: " + grade + "\nOgrenci Id: "
						+ id);
	}




	public void setId() {
		ogrenciSayi++;
		counter++;
		
		id=""+year+grade+counter;
		
	}
	
	
	

}
