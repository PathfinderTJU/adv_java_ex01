package adv_java.ex01.hardware;

public class Asus extends Mainboard{
	private String brand = "Asus";
	private String name;
	private int speed;
	private int price;
	
	public Asus() {
		
	}
	
	public Asus(String name, int speed, int price) {
		this.name = name;
		this.speed = speed;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
}
