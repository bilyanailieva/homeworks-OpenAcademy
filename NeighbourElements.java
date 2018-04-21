package homewoksOpenAcad;

import java.util.Scanner;

public class NeighbourElements {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int k, p;
		boolean result = false;

		System.out.println("How many elements in your array?");
		int n = input.nextInt();

		int[] elements = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter element " + i + " of array");
			elements[i] = input.nextInt();
		}

		System.out.println("Enter k and p to check if elements[j]+k == elements[j+1]*p");
		k = input.nextInt();
		p = input.nextInt();

		for (int j = 1; j <= n - 1; j++) {
			if ((elements[j - 1] + k) == (elements[j] * p)) {
				result = true;
			}
		}

		System.out.println(result);

	}
}
