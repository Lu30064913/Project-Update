package com.type;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CarCompanySelection {
	
	String selectedCompany = "";
	
	public String selectCarCompany() {
		Scanner carScanner = new Scanner(System.in); 
        System.out.println("Please Select your preferrable Car Company ");
			int i =1;
			Iterator iterator = getCarCompanyNames().iterator();
			while(iterator.hasNext()) {
				String carCompany = (String)iterator.next();
				System.out.println(i+")"+carCompany);
				i = i+1;
			}
			
			switch(carScanner.nextInt()) {
			case 1: selectedCompany = "maruthi";
			        break;
			case 2: selectedCompany = "honda";
	        		break;
			case 3: selectedCompany = "bmw";
	        		break;
			case 4: selectedCompany = "benz";
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
