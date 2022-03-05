package com.order.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.order.factory.BenzModelPlan;

public class BenzModelPlanTest {

	@Test
	public void purchasePlanTest() {
		BenzModelPlan bmp = new BenzModelPlan();
		bmp.purchasePlan();
		assertNotNull(bmp);
	}
}
