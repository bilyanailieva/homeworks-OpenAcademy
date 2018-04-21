package homewoksOpenAcad;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		int two = 0, three = 0, four = 0, five = 0, six = 0, max = 0;
		Scanner input = new Scanner(System.in);

		System.out.println("How many students in your class?");
		int n = input.nextInt();
		int[] grades = new int[n];

		for (int i = 0; i < grades.length; i++) {
			System.out.println("Please enter grade");
			grades[i] = input.nextInt();

			switch (grades[i]) {

			case 2:
				two += 1;
				if (two > max) {
					max = two;
				}
				break;

			case 3:
				three += 1;
				if (three > max) {
					max = three;
				}
				break;
			case 4:
				four += 1;
				if (four > max) {
					max = four;
				}
				break;
			case 5:
				five += 1;
				if (five > max) {
					max = five;
				}
				break;
			case 6:
				six += 1;
				if (six > max) {
					max = six;
				}
				break;
			default:
				System.out.println("No such grade!");
				break;
			}

		}
		input.close();

		System.out.println("There are" + two + " 2, " + three + " 3, " + four + " 4, " + five + " 5, " + six + " 6.");
		System.out.println("Most of the students have grade " + max);

	}

}
