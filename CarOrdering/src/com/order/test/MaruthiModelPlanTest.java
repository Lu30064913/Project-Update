package com.order.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.order.factory.MaruthiModelPlan;

public class MaruthiModelPlanTest {

	@Test
	public void purchasePlanTest() {
		MaruthiModelPlan maruthi = new MaruthiModelPlan();
		maruthi.purchasePlan();
		assertNotNull(maruthi);
	}
}
