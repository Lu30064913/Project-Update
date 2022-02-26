package com.order.factory;

public class CarOrderingFactory {

	public static CarOrdering chooseCompany(String selectedCompany) {
		if ("maruthi".equalsIgnoreCase(selectedCompany)) {
			return new MaruthiModelPlan();
		} else if ("honda".equalsIgnoreCase(selectedCompany)) {
			return new HondaModelPlan();
		} else if ("bmw".equalsIgnoreCase(selectedCompany)) {
			return new BmwModelPlan();
		} else if ("benz".equalsIgnoreCase(selectedCompany)) {
			return new BenzModelPlan();
		}
		return null;
	}
}
