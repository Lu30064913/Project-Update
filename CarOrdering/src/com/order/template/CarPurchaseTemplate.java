package com.order.template;

public abstract class CarPurchaseTemplate {

	public abstract String selectCar();

	public abstract void getPriceDetails(String carModel);

	public abstract boolean transactionMode();

	public abstract void documentation();

	public abstract void loanProcess();

	public abstract void vehicleDelivery();

	public final void process() {
		String carModel = selectCar();
		getPriceDetails(carModel);

		if (transactionMode()) {
			loanProcess();
		}
		documentation();
		vehicleDelivery();
	}
}