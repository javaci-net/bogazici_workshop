package chapter09;

import java.util.Random;

public class RandomSinifiKullanimi {

	public static void main(String[] args) {
		// Math.random()
		
		Random random1 = new Random(15);// X * 17 / 23 + 9 % 13
		System.out.print("From random1: ");
		for (int i = 0; i < 10; i++)
			System.out.print(random1.nextInt(1000) + " ");
		
		
		Random random2 = new Random(15); // X * 17 / 23 + 9 % 13
		System.out.print("\nFrom random2: ");
		for (int i = 0; i < 10; i++)
			System.out.print(random2.nextInt(1000) + " ");

	}

}
