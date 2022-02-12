package com.type;

import java.util.Iterator;
import java.util.Scanner;

public class HondaModelPlan  implements CarOrdering {
	
public void purchasePlan() {
	CarPurchaseTemplate pl = new Honda();
    pl.process();
		
	}
}     
