package homewoksOpenAcad;

public class Engine {
	private int cubics;
	private String brand;
	private int horsepower;
	public Engine(int cubics, String brand, int horsepower) {
		super();
		this.cubics = cubics;
		this.brand = brand;
		this.horsepower = horsepower;
	}
	public int getCubics() {
		return cubics;
	}
	public void setCubics(int cubics) {
		this.cubics = cubics;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getHorsepower() {
		return horsepower;
	}
	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}
	@Override
	public String toString() {
		return "Engine [cubics=" + cubics + ", brand=" + brand + ", horsepower=" + horsepower + "]";
	}
	
	
}
