package chapter09;

import java.util.Date;

public class DateSinifininKullanimi {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		System.out.println(date.toString());
		System.out.println(date.getTime());
		
		date = new Date(0);
		System.out.println(date);
		
		date.setTime(Integer.MAX_VALUE);
		System.out.println(date);
		
		date.setTime(Long.MAX_VALUE);
		System.out.println(date);

	}

}
