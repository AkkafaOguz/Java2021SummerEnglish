package Exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class E01 {

	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\\\Users\\\\90534\\\\eclipse-workspace\\\\java2021summertr\\\\src\\\\day41_Exeptions\\\\file"));
			String l = br.readLine();
			while(l!=null) {
				System.out.println(l);
				l=br.readLine();
			}
		} catch (FileNotFoundException e) {
		
			System.out.println("There is a problem about the path");
		} catch (IOException e) {
			System.out.println("There is a problem about reading the file");
		}

	}

}
