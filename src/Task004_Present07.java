
public class Task004_Present07 {

	public static void main(String[] args) {
		int n = 100;
		
		int[][] matrix = new int[4][4];
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = n - 15;
				// System.out.println(matrix[i][j]);
	
				System.out.print(matrix[i][j] + " ");
				n--;
			}
			System.out.println();

		}
	}
}
