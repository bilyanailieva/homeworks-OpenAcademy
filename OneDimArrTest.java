package homewoksOpenAcad;

import java.util.Scanner;

public class OneDimArrTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter length of array:");
		int n = input.nextInt();
		System.out.println("Please enter element p");
		int p = input.nextInt();

		int[] a = new int[n];

		System.out.println("Enter elements of array");
		for (int i = 0; i < n; i++) {
			a[i] = input.nextInt();
		}
		OneDimArr ar = new OneDimArr(p, a);

		int sum = ar.findSumofEven(a);
		System.out.println("Sum of even elements in array " + sum);
		int count = ar.findSmallerThanP(p, a);
		System.out.println("Sum of elements smaller than p in array " + count);
		int product = ar.findProductofElem(a);
		System.out.println("Product of elements that divide 5, but not 7 is " + product);
		
		input.close();

	}

}
