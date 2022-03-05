package com.order.decorator;

public class JumperCables extends CarDecorator {
	public JumperCables() {
		super();
	}

	public void purchasePlan() {
		purchaseJumperCables();
	}

	public void purchaseJumperCables() {
		System.out.println(" -----------------------------------------------------------");
		System.out.println("|         Thanks for Purchasing Jumper Cables               |");
		System.out.println("|         Two Jumper Cables has been purchased              |");
		System.out.println(" -----------------------------------------------------------");
	}
}
