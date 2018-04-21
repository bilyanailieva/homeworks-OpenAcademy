package homewoksOpenAcad;

public class ArrayOps {
	private int arr[][];
	private int k;

	public ArrayOps(int arr[][], int k) {
		this.arr = arr;
		this.k = k;
	}

	public boolean findK(int arr[][], int k, int n, int m) {
		boolean count = false;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == k) {
					count = true;
				}
			}
		}

		return count;
	}

	public boolean findNeighbours(int arr[][], int k, int n, int m) {
		boolean count = false;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m - 1; j++) {
				if (arr[i][j] == arr[i][j + 1] && arr[i][j] == k) {
					count = true;
				}
			}
		}
		return count;
	}

	public boolean findNeighonCols(int arr[][], int k, int n, int m) {
		boolean count = false;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == arr[i + 1][j] && arr[i][j] == k) {
					count = true;
				}
			}
		}
		return count;
	}

	public void findIndex(int arr[][], int k, int n, int m) {
		int count = 0;
		for (int i = n - 1; i >= 0; i--) {
			for (int j = m - 1; j >= 0; j--) {
				if (arr[i][j] == k) {
					count++;
					if (count == 2) {
						System.out.println("prelast element with value k on row " + i + " and on col " + j);
						break;
					}
				}

			}
		}
	}
}
