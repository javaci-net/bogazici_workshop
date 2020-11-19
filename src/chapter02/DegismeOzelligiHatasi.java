package chapter02;

public class DegismeOzelligiHatasi {

	public static void main(String[] args) {
		System.out.println(5 / 2 * 2);
		
		System.out.println(5 * 2 / 2);
		
		System.out.println((int) 5.9 / 2 * 2);
		
		System.out.println((double) 5 * 2 / 2);

		double d = 9.9;
		int i = 5;
		// d = i;
		i = (int) d;
		System.out.println(i);
		System.out.println(d);
		
		System.out.println((int) (d / 2 + 0.10));
	}
}
