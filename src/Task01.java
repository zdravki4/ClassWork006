import java.util.Arrays;

public class Task01 {

	public static void main(String[] args) {

		int[] arrayOne = {0,1,2,3,4};		
		int lenArrOne = arrayOne.length;
		
		int[] arrayTwo = new int[lenArrOne];
		
		for (int i = 0; i < arrayOne.length; i++) {
			arrayTwo[i] = arrayOne[i];
		}
		
		System.out.println("ArrayOne is: " + Arrays.toString(arrayOne));
		System.out.println();
		System.out.println("ArrayTwo is: " + Arrays.toString(arrayTwo));	

		

	}

}
