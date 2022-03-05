package com.order.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.order.factory.BmwModelPlan;

public class BmwModelPlanTest {

	@Test
	public void purchasePlanTest() {
		BmwModelPlan bmw = new BmwModelPlan();
		bmw.purchasePlan();
		assertNotNull(bmw);
	}
}
