package homewoksOpenAcad;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		int n, k, p=0;
		int result = 0;
		System.out.println("Enter length of array");
		n = input.nextInt();
		
		int[] numbers = new int[n];
		for(int i =0; i< numbers.length;i++) {
			numbers[i] = input.nextInt();
		}
		
		System.out.println("Input k and p");
		k = input.nextInt();
		p = input.nextInt();
		
		for(int i =0; i<numbers.length; i++) {
			if(numbers[i] > k && numbers[i] < p) {
				result+= numbers[i];
			}
		}
		System.out.println(result);

	}

}
