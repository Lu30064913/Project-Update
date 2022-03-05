package com.order.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.order.decorator.GPSNavigators;

public class GPSNavigatorsTest {

	@Test
	public void purchasePlanTest() {
		GPSNavigators gps = new GPSNavigators();
		gps.purchasePlan();
		assertNotNull(gps);
	}

	@Test
	public void installGPSNavigationSystemTest() {
		GPSNavigators gps = new GPSNavigators();
		gps.installGPSNavigationSystem();
		assertNotNull(gps);
	}
}
