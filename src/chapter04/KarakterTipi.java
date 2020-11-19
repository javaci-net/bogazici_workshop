package chapter04;

public class KarakterTipi {

	public static void main(String[] args) {
		char ch = 33;
		System.out.println(ch);
		
		int i = ch;
		
		System.out.println(i);
		
		for (char ch2 = 0; ch2 < 65_000; ch2++) {
			System.out.print(ch2 + " ");
			
			if ((ch2 + 1) % 50 == 0)
				System.out.println();
			
		}
		
		System.out.println("a\naa\na\ta\ta\n");
	}

}
