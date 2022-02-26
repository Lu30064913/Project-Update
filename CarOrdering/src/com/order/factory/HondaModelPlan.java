package com.order.factory;

import com.order.template.CarPurchaseTemplate;
import com.order.template.Honda;

public class HondaModelPlan implements CarOrdering {

	public void purchasePlan() {
		CarPurchaseTemplate pl = new Honda();
		pl.process();
	}
}
