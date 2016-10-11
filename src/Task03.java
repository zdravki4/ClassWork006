import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {		
						
				Scanner input = new Scanner(System.in);
				System.out.println("Enter length of the 1 dimensional array: ");
				int n = input.nextInt();
				int[] array = new int[n];
				
				System.out.println("Enter array's items,each followed by <enter>: ");
				for (int i = 0; i < n; i++) {
					array[i] = input.nextInt();
				}
				boolean symmetric = true;
				for (int i = 0; i < (array.length + 1) / 2; i++) {
					if (array[i] != array[n - i - 1])
						symmetric = false;
				}
				System.out.printf("Symmetric? %b%n", symmetric);
			}		
	}


