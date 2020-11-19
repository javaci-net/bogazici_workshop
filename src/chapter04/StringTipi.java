package chapter04;

import java.util.Locale;

public class StringTipi {
	public static void main(String[] args) {
		String s = "Merhaba";
		
		double d = 5.8;
		
		System.out.println(d);
		
		System.out.println(s.length());
		
		char ch = s.charAt(0);
		System.out.println(ch);
		
		System.out.println(s.charAt(1));
		System.out.println(s.toUpperCase());
		s = s.toLowerCase();
		System.out.println(s);
		
		System.out.println(s.equals("MERHABA"));
		System.out.println(s.equals("merhaba"));
		System.out.println(s.equalsIgnoreCase("MERHABA"));
		
		String turkceKarakterler = "öçşiüğÖÇŞIĞÜ";
		System.out.println(turkceKarakterler.toUpperCase(new Locale("tr", "TR")));
		System.out.println(turkceKarakterler.toLowerCase());
		
		System.out.println((int)'Ğ');
		System.out.println((int)'ğ');
		System.out.println((int)'Ş');
		System.out.println((int)'ş');
		System.out.println((int)'ı');
		
		System.out.println("cb".compareTo("ab"));
		System.out.println("ab".compareTo("cb"));
		System.out.println("aa".compareTo("aa"));
		
		System.out.println(s.substring(1, 3));
		
		System.out.println(s.substring(5));
		
		System.out.println(s.indexOf('a'));
		System.out.println(s.indexOf('z'));
		System.out.println(s.indexOf('a', 5));
		
		String sayitutanString = "15";
		
		int sayi = Integer.parseInt(sayitutanString);
		
		System.out.println(sayi);
		
		sayitutanString = sayi + 25 + "";
		
		System.out.println(sayitutanString);
		
	}

}
