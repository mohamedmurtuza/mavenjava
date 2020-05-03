package Qaclickacademy;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class Array {
	
	@Test
	public void array() {
		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Hello");
		a.add(0,"Guddu");

		System.out.println(a);
		
		System.out.println(a.equals("Guddu, Hello"));
		
		System.out.println(a.get(1));
		
		System.out.println(a.getClass());
		
		System.out.println(a.indexOf("Guddu"));
		
		
		//System.out.println(a.isEmpty());
		
		
	System.out.println(a.lastIndexOf("Hello"));
	
	
	System.out.println(a.set(1,"Murtuza"));
	System.out.println(a);
	
	System.out.println(a.size());
	
	System.out.println(a.spliterator());
	System.out.println(a);
		
	
		
	}

}
