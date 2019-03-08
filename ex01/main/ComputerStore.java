package adv_java.ex01.main;

import adv_java.ex01.hardware.*;

public class ComputerStore {
	
	private static Computer computer1 
		= new Computer("DELL", new Intel("i5", 4, 500), new Samsung("A1", 4, 100), new Seagate("S1", 512, 300), new Asus("T3", 128, 500));
	private static Computer computer2 
		= new Computer("VSUS", new Intel("i7", 8, 1000), new Kingston("K3", 8, 120), new Seagate("S2", 512, 300), new Gigabyte("G4", 128, 450));
	private static Computer computer3 
		= new Computer("LENOVE", new AMD("M300", 8, 900), new Samsung("A5", 8, 200), new WestDigitals("WD2", 256, 200), new Gigabyte("G7", 256, 600));
	
	public ComputerStore() {
		
	}
	
	public static void main(String args[]) {
		computer1.show();
		computer2.show();
		computer3.show();
		
		computer1.work();
		computer2.work();
		computer3.work();
	}
}
