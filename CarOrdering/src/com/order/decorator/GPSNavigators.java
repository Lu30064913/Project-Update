package com.order.decorator;

public class GPSNavigators extends CarDecorator {
	public GPSNavigators() {
		super();
	}

	public void purchasePlan() {
		installGPSNavigationSystem();
	}

	public void installGPSNavigationSystem() {
		System.out.println(" -----------------------------------------------------------");
		System.out.println("|            Thanks for GPS Navigation System               |");
		System.out.println("|     Branded GPS Navigation System has been installed      |");
		System.out.println(" -----------------------------------------------------------");
		
	}

}
