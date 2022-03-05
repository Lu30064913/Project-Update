package com.order;

import com.order.factory.CarOrdering;
import com.order.factory.CarOrderingFactory;

public class CarOrderingDemo {

	public static void main(String[] args) {

		CarCompanySelection ccs = new CarCompanySelection();
		String company = ccs.selectCarCompany();
		CarOrdering co = CarOrderingFactory.chooseCompany(company);
		co.purchasePlan();

		System.out.println();

		CarCompanySelection ccs1 = new CarCompanySelection();
		String company1 = ccs1.selectCarCompany();
		CarOrdering co1 = CarOrderingFactory.chooseCompany(company1);
		co1.purchasePlan();

	}

}
