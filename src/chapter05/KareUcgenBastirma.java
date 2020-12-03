package chapter05;

public class KareUcgenBastirma {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-------------------");
		for (int i = 0; i < 10; i++) {
			for (int j = i + 1; j < 10; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-------------------");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(i + "-" + j + " ");
			}
			System.out.println();
		}
		System.out.println("-------------------");
		for (int i = 0; i < 10; i++) {
			for (int j = i + 1; j < 10; j++) {
				System.out.print(i + "-" + j + " ");
			}
			System.out.println();
		}

	}

}
