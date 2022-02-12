package com.type;

import java.util.Iterator;
import java.util.Scanner;

public class BmwModelPlan  implements CarOrdering {
	
public void purchasePlan() {
		
	CarPurchaseTemplate pl = new Bmw();
    pl.process();
	}
}     



