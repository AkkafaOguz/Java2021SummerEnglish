package Exceptions;

public class SocrativeQuestion10 {
	
	String str = "a";
	void A () {
		try {
			
			str+= "b";
			B();
		} catch (Exception e) {
			
			str+="c";
		}
	}

	void B () throws Exception {   //burada throws Exception yazmasa da kod ayni sekilde calisiyor.
		
		try {
			
			str+= "d";
			C();                   // C(); bu komut C methodunu getirip B methodunun icinde calistiyor. Yani ben C methoduna gitmiyorum. 
			                       // Bu yuzden bu methodda herhangi bir sorun cikarsa B methodumun catch blogu bunu yakaliyor.
		} catch (Exception e) {
			
			str+="e";
		} finally {
			
			str+= "f";
		}
		
		str += "g";
		
	}

	void C() throws Exception{     //burada throws Exception yazmasa da kod ayni sekilde calisiyor.
	
		System.out.println(12/0);
		
	}
	
	void display() {
		System.out.println(str);
	}

	public static void main(String[] args) {
		
		SocrativeQuestion10 obj = new SocrativeQuestion10();
		obj.A();
		obj.display();

	}

}
