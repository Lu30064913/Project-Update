package com.order.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.order.factory.HondaModelPlan;

public class HondaModelPlanTest {

	@Test
	public void purchasePlanTest() {
		HondaModelPlan honda = new HondaModelPlan();
		honda.purchasePlan();
		assertNotNull(honda);
	}
}
