package adv_java.ex01.hardware;

public class Seagate extends HardDisk{
	
	private String brand = "Seagate";
	private String name;
	private int volumn;
	private int price;
	
	public Seagate() {
		
	}
	
	public Seagate(String name, int volumn, int price) {
		this.name = name;
		this.volumn = volumn;
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
	
	
}
