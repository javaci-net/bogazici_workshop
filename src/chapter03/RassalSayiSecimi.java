package chapter03;

public class RassalSayiSecimi {

	public static void main(String[] args) {

		System.out.println((int) (Math.random() * 10) - 10);
		
		// [-500, -300)

		System.out.println((int) (Math.random() * 200) - 500);
		
		
		// [100 - 120) -> 100 <= x < 120
		
		System.out.println((int) (Math.random() * 20) + 100);
	}

}
