package adv_java.ex01.hardware;

public abstract class HardDisk implements Work, Show{
	
	private String brand;
	private String name;
	private int volumn;
	private int price;
	
	public HardDisk() {
		
	}
	
	@Override
	public void work() {
		System.out.println("HardDisk work.");
	}
	
	@Override
	public void show() {
		System.out.println("HardDisk: " + this.getBrand() + " " + this.getName() + " volumn: " + this.getVolumn() + "G price: " + this.getPrice());
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVolumn() {
		return volumn;
	}

	public void setVolumn(int volumn) {
		this.volumn = volumn;
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
