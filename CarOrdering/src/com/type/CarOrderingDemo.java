package com.type;

import java.util.Iterator;
import java.util.Scanner;

public class CarOrderingDemo {
	
		public static void main(String[] args) {
		
		CarCompanySelection ccs = new CarCompanySelection();
		String company = ccs.selectCarCompany();
		CarOrdering co = CarOrderingFactory.chooseCompany(company);
		co.purchasePlan();
		
		CarCompanySelection ccs1 = new CarCompanySelection();
		String company1 = ccs1.selectCarCompany();
		CarOrdering co1 = CarOrderingFactory.chooseCompany(company1);
		co1.purchasePlan();
		
		
	}
}
