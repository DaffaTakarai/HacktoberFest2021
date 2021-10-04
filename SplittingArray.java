public import java.util.*;

public class SplittingArray {

	// this method accepts a array and prints the value
	static void pprint(int arr[])
	{
		for (int var : arr) {
			System.out.print(var + " ");
		}

		System.out.println();
	}

	public static void main(String args[])
	{
		// original array
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

		// size of array
		int n = a.length;

		// accepting the value of position from the user

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter position to split.");

		int pos = scanner.nextInt();

		// validating the position for invalid values.
		if (pos > 0 && pos < n) {
			// method 1 : using two for loops

			// declaring array B and C
			int b[] = new int[pos];
			int c[] = new int[n - pos];

			// initializing array B
			for (int i = 0; i < pos; i++) {
				b[i] = a[i];
			}

			// initializing array C
			for (int i = 0; i < n - pos; i++) {
				c[i] = a[i + pos];
			}

			// printing the array b and c

			pprint(b);
			pprint(c);
		}

		else {
			System.out.println("Invalid position.");
		}
	}
}
class SplittingArray {
    
}
