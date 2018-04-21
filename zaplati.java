package homewoksOpenAcad;

import java.util.Scanner;

public class zaplati {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("Enter length of array");
		n = input.nextInt();
		
		int[] zaplati = new int[n];
		for(int i =0; i< zaplati.length;i++) {
			zaplati[i] = input.nextInt();
		}
		
		int k = 0;
		for(int i =0; i < zaplati.length;i++) {
			if(zaplati[i]==1500) {
				k++;
			}
			if(k == 3) {
				System.out.println(i);
				break;
			}
		}
		

	}

}
