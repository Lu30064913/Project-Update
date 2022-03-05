package com.order.factory;

import com.order.template.Bmw;
import com.order.template.CarPurchaseTemplate;

public class BmwModelPlan  implements CarOrdering {
	
public void purchasePlan() {
		
	CarPurchaseTemplate pl = new Bmw();
    pl.process();
    
	}
}     



