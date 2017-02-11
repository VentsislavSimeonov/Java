package lesson03;

public class MatrixExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		int[][] matrix = new int[3][4];
		
		System.out.println(matrix.length);
		System.out.println(matrix[0].length);
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = 1;
			}
		}
		
		matrix[0][0] = 15;
		matrix[2][3] = 18;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}
