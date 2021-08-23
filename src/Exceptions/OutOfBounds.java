package Exceptions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OutOfBounds {

	public static void main(String[] args) {
		
		String str = "Learning java is so funny!";
		
		System.out.println(str.charAt(5));
		
		
		//System.out.println(str.charAt(27));
		
		//IllegalStateException
		// when ew try to use a method at an inappropriate (wrong) time.
		
		List<Integer>list= new ArrayList<>();
		list.add(12);
		list.add(23);
		list.add(45);
		
		Iterator<Integer> litr = list.iterator();
		litr.next();
		litr.remove();
		
		System.out.println(list);

	}

}
