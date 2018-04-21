package homewoksOpenAcad;

public class OneDimArr {
	private int p;
	private int[] arr;

	public OneDimArr(int p, int[] arr) {
		super();
		this.p = p;
		this.arr = arr;
	}

	public int findSumofEven(int[] arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				sum++;
			}
		}
		return sum;
	}

	public int findSmallerThanP(int p, int[] arr) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < p) {
				count++;
			}
		}
		return count;
	}

	public int findProductofElem(int[] arr) {
		int product = 1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 5 == 0 && arr[i] % 7 != 0) {
				product *= arr[i];
			}
		}
		return product;
	}

}
