package com.order;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.order.iterator.CarOrderingIterator;

public class CarCompanySelection {

	String selectedCompany = "";
	
	private CarOrderingIterator createIterator() {
		String[] data = new String[] { "Maruthi", "Honda", "BMW", "Benz" };
		return new CarOrderingIterator(data);
	}

	public String selectCarCompany() {
		Scanner carScanner = new Scanner(System.in);
		System.out.println("Please Select your preferrable Car Company ");

		int i = 1;
		
		CarOrderingIterator<String> temp = createIterator();
		while (temp.hasNext()) {
			String value = temp.next().toString();
			System.out.println(i + ")" + value);
			i = i + 1;
		}

		switch (carScanner.nextInt()) {
		case 1:
			selectedCompany = "maruthi";
			break;
		case 2:
			selectedCompany = "honda";
			break;
		case 3:
			selectedCompany = "bmw";
			break;
		case 4:
			selectedCompany = "benz";
			break;
		}
		carScanner = null;
		return selectedCompany;
	}

	private List<String> getCarCompanyNames() {
		List<String> ccn = new ArrayList<String>();
		ccn.add("Maruthi");
		ccn.add("Honda");
		ccn.add("BMW");
		ccn.add("Benz");
		return ccn;
	}

}
