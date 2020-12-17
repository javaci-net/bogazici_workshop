package chapter08;

public class DiziIslemleri {

	public static void main(String[] args) {
		int[][] matrix = new int[5][5];

		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = (int) (Math.random() * 100);
			}
		}

		printMatrix(matrix);

		for (int column = 0; column < matrix[0].length; column++) {
			int total = 0;
			for (int row = 0; row < matrix.length; row++)
				total += matrix[row][column];
			System.out.println("Sum for column " + column + " is " + total);
		}

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				int r = (int) (Math.random() * matrix.length);
				int c = (int) (Math.random() * matrix[row].length);

				// Swap matrix[i][j] with matrix[i1][j1
				int temp = matrix[row][col];
				matrix[row][col] = matrix[r][c];
				matrix[r][c] = temp;
			}
		}
		
		printMatrix(matrix);
	}

	private static void printMatrix(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.printf("%3d", matrix[row][column]);
			}
			System.out.println();
		}
	}

}
