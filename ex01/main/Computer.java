package adv_java.ex01.main;

import adv_java.ex01.hardware.*;

public class Computer implements Work, Show{
	
	private String name;
	private int price;
	
	private CPU cpu;
	private Memory memory;
	private HardDisk hardDisk;
	private Mainboard mainboard;
	
	public Computer() {
		//TODO Auto-generated constructor stub.
	}
	
	public Computer(String name, CPU cpu, Memory memory, HardDisk hardDisk, Mainboard mainboard) {
		this.name = name;
		this.cpu = cpu;
		this.memory = memory; 
		this.hardDisk = hardDisk;
		this.mainboard = mainboard;
		this.price = this.totalprice();
	}
	
	public int totalprice() {
		return cpu.getPrice() + memory.getPrice() + mainboard.getPrice() + hardDisk.getPrice();
	}
	
	public void show() {
		System.out.println("Computer:" + this.getName());
		System.out.println("Price:" + this.getPrice());
		this.cpu.show();
		this.memory.show();
		this.hardDisk.show();
		this.mainboard.show();
		System.out.println("------------------");
	}
	
	public void work() {
		System.out.println(this.getName() + " starts working.");
		this.cpu.work();
		this.memory.work();
		this.hardDisk.work();
		this.mainboard.work();
		System.out.println("------------------");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
