package adv_java.ex01.hardware;

public class AMD extends CPU{
	
	private String brand = "AMD";
	private String name;
	private int coreNum;;
	private int price;;
	
	public AMD() {
		
	}
	
	public AMD(String name, int coreNum, int price) {
		this.name = name;
		this.coreNum = coreNum;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public int getCoreNum() {
		return coreNum;
	}

	public int getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCoreNum(int coreNum) {
		this.coreNum = coreNum;
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
