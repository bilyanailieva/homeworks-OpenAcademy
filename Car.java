package homewoksOpenAcad;

public class Car {
	private String model;
	private String brand;
	private String color;
	private int year;
	private double price;
	private Engine engine;

	public Car(String model, String brand, String color, int year, double price) {
		this.model = model;
		this.brand = brand;
		this.color = color;
		this.year = year;
		this.price = price;
		
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getModel() {
		return model;
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public int getYear() {
		return year;
	}

	public double getPrice() {
		return price;
	}

	public Engine getEngine() {
		return engine;
	}

	public Car(String model, String brand, String color, int year, double price, Engine engine) {
		super();
		this.model = model;
		this.brand = brand;
		this.color = color;
		this.year = year;
		this.price = price;
		this.engine = engine;
	}

	public String toString() {
		return this.getModel() + " " + this.getBrand() + " " + this.getColor() + " " + this.getYear() + " "
				+ this.getPrice() + " " + this.getEngine();
	}
}
