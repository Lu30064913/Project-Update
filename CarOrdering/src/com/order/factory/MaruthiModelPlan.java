package com.order.factory;

import com.order.template.CarPurchaseTemplate;
import com.order.template.Maruthi;

public class MaruthiModelPlan implements CarOrdering {

	public void purchasePlan() {
		CarPurchaseTemplate pl = new Maruthi();
		pl.process();
	}
}
