package com.type;

import java.util.Iterator;
import java.util.Scanner;

public class BenzModelPlan  implements CarOrdering {
	
public void purchasePlan() {
	CarPurchaseTemplate pl = new Benz();
    pl.process();
		
	}
}     
