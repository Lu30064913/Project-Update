package com.order.template;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.order.decorator.AudioVideoSterioType;
import com.order.decorator.GPSNavigators;
import com.order.decorator.JumperCables;

public class Benz extends CarPurchaseTemplate {
	String selectedCarModel = "";

	@Override
	public String selectCar() {
		Scanner mScanner = new Scanner(System.in);
		System.out.println("Please Select your preferrable Model: ");
		int i = 1;
		Iterator iterator = getBenzModels().iterator();
		while (iterator.hasNext()) {
			String model = (String) iterator.next();
			System.out.println(i + ") " + model);
			i = i + 1;
		}
		selectedCarModel = getBenzModels().get(mScanner.nextInt() - 1);
		return selectedCarModel;
	}

	@Override
	public void getPriceDetails(String carModel) {
		double price = 0;
		GPSNavigators gps = new GPSNavigators();
		JumperCables jc = new JumperCables();
		AudioVideoSterioType avst = new AudioVideoSterioType();
		if ("Benz A class".equals(carModel)) {
			avst.purchasePlan();
			gps.purchasePlan();
			price = 2000000;
		} else if ("Benz C class".equals(carModel)) {
			avst.purchasePlan();
			gps.purchasePlan();
			jc.purchasePlan();
			price = 2260600;
		} else if ("Benz E class".equals(carModel)) {
			avst.purchasePlan();
			price = 2805000;
		} else if ("Benz G class".equals(carModel)) {
			jc.purchasePlan();
			price = 3345000;
		}
		double roadtax = ((price * 5) / 100);
		double registration = ((price * 7) / 100);
		System.out.println("Basic Price for " + carModel + " is " + price);
		System.out.println("Road tax for " + carModel + " is " + roadtax);
		System.out.println("Registration Charges for " + carModel + " is " + registration);
		System.out.println("--------------------------------------");
		System.out.println("Total Cost for " + carModel + " is " + (price + roadtax + registration));

	}

	@Override
	public boolean transactionMode() {
		Scanner mScanner = new Scanner(System.in);
		System.out.println("Please Select your Transaction Mode: ");
		int i = 1;
		Iterator iterator = getTransactionMode().iterator();
		while (iterator.hasNext()) {
			String mode = (String) iterator.next();
			System.out.println(i + ") " + mode);
			i = i + 1;
		}
		if (1 == mScanner.nextInt()) {
			return true;
		}
		return false;
	}

	@Override
	public void documentation() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.getMessage();
		}
		System.out.println("All Required documents are received");
	}

	@Override
	public void loanProcess() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.getMessage();
		}
		System.out.println("Congratulations your Car Loan is sanctioned");
	}

	@Override
	public void vehicleDelivery() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.getMessage();
		}
		System.out.println("Congratulations your Car has been delivered");
	}

	private List<String> getBenzModels() {
		List<String> mm = new ArrayList<String>();
		mm.add("Benz A class");
		mm.add("Benz C class");
		mm.add("Benz E class");
		mm.add("Benz G class");
		return mm;
	}

	private List<String> getTransactionMode() {
		List<String> mm = new ArrayList<String>();
		mm.add("Loan");
		mm.add("Cash");
		mm.add("Credit Card");
		return mm;
	}
}
