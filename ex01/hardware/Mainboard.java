package adv_java.ex01.hardware;

public abstract class Mainboard implements Work, Show{
	private String brand;
	private String name;
	private int speed;
	private int price;
	
	public Mainboard() {
		
	}
	
	@Override
	public void work() {
		System.out.println("Mainboard work.");
	}
	
	@Override
	public void show() {
		System.out.println("Mainboard: " + this.getBrand() + " " + this.getName() + " speed: " + this.getSpeed() + "kbits/s price: " + this.getPrice());
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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
}
