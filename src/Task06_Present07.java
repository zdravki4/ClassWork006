
public class Task06_Present07 {	

	public static void main(String[] args) {
		int n = 100;
		int[][] matrix = new int[4][4];
		System.out.println("Original matrix"+ "\n");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = n - 15;
				// System.out.println(matrix[i][j]);

				System.out.print(matrix[i][j] + " ");
				n--;

			}
			System.out.println();
						
		}
		System.out.println();
		System.out.println("Modified original matrix, each odd item is multiplied by 2: "+"\n");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] % 2 != 0) {
					matrix[i][j] = matrix[i][j] * 2;
				}				
				System.out.print(matrix[i][j] + " ");

			}
			System.out.println();
		}

	}

}
