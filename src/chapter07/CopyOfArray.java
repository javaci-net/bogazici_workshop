package chapter07;

import java.util.Arrays;

public class CopyOfArray {

	public static void main(String[] args) {
		int[] a1 = { 0, 1, 2 };

		int[] a2 = { 3, 4, 5 };

		System.out.println(a1[2]);

		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));

		a1[0] = a2[2];
		
		a2[2] = 99;

		System.out.println("--------");
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));

		a1 = a2;

		System.out.println("--------");
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		
		a2[2] = -1;
		
		System.out.println("--------");
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
	}

}
