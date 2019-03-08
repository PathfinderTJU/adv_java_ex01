package adv_java.ex01.hardware;

public abstract class CPU implements Work, Show{
	private String brand;
	private String name;
	private int coreNum;
	private int price;
	
	public CPU() {
		
	}
	
	@Override
	public void work() {
		System.out.println("CPU work.");
	}
	
	@Override
	public void show() {
		System.out.println("CPU: " + this.getBrand() + " " + this.getName() + " coreNum: " + this.getCoreNum() + " price: " + this.getPrice());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCoreNum() {
		return coreNum;
	}

	public void setCoreNum(int coreNum) {
		this.coreNum = coreNum;
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
