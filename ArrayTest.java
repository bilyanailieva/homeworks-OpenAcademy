package homewoksOpenAcad;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int m = input.nextInt();
		int k = input.nextInt();

		int[][] a = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = input.nextInt();
			}
		}

		ArrayOps ar = new ArrayOps(a, k);

		System.out.println(ar.findK(a, k, n, m));
		System.out.println(ar.findNeighbours(a, k, n, m));
		System.out.println(ar.findNeighonCols(a, k, n, m));
		ar.findIndex(a, k, n, m);

	}

}
