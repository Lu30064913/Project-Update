package com.order.factory;

import com.order.template.Benz;
import com.order.template.CarPurchaseTemplate;

public class BenzModelPlan implements CarOrdering {

	public void purchasePlan() {
		CarPurchaseTemplate pl = new Benz();
		pl.process();

	}
}
