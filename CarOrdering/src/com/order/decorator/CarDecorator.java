package com.order.decorator;

import com.order.factory.CarOrdering;

public abstract class CarDecorator implements CarOrdering {
	CarOrdering carOrdering;

	public CarDecorator() {
		super();
		this.carOrdering = carOrdering;
	}

	public void purchasePlan() {
		carOrdering.purchasePlan();
	}

}
