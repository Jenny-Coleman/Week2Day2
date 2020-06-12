
class Car {

	String brand;

	public Car() {
		brand = "ford";
	}

	public String getBrand() {
		return brand;
	}

	void run() {
		System.out.println("Car is running...");
	}

}

public class Sample {

	public static void main(String[] args) {
			Car ford = new Car();
			System.out.println(ford.getBrand());
	}

}