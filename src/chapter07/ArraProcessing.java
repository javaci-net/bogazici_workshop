package chapter07;

public class ArraProcessing {

	public static void main(String[] args) {
		int[] array = createRandomArray(100);
		
		print(array);
		
		System.out.println("Max: " + max(array));
		
		suffleArray(array);
		
		print(array);

	}

	public static void suffleArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int randomIndex = (int) (Math.random() * array.length);
			
			int temp = array[i];
			array[i] = array[randomIndex];
			array[randomIndex] = temp;
		}
		
	}

	public static int[] createRandomArray(int n) {
		int[] array = new int[n];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		return array;
	}

	public static void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%3d", array[i]);
			if ((i + 1) % 10 == 0)
				System.out.println();
		}
	}

	public static int max(int[] array) {
		int max = -1;
		for (int i = 0; i < array.length; i++) {
			if (max < array[i])
				max = array[i];
		}
		return max;
	}

}
