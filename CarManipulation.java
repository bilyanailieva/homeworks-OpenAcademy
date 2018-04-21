package homewoksOpenAcad;

import java.util.Scanner;

public class CarManipulation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String model = input.nextLine();
		String brand = input.nextLine();
		String color = input.nextLine();
		int year = input.nextInt();
		double price = input.nextDouble();
		
		Engine eng = new Engine(500, "marka", 150);
		
		Car car1 = new Car(model, brand, color, year, price, eng);
		System.out.println(car1);
		
		Car car2 = new Car("v40", "volvo", "silver", 2004, 4500.50);
		System.out.println(car2);
		
		input.close();
	}

}
