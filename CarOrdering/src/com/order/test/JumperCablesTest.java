package com.order.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.order.decorator.JumperCables;

public class JumperCablesTest {

	@Test
	public void purchasePlanTest() {
		JumperCables gps = new JumperCables();
		gps.purchasePlan();
		assertNotNull(gps);
	}

	@Test
	public void installAudioVideoSterioTypeTest() {
		JumperCables gps = new JumperCables();
		gps.purchaseJumperCables();
		assertNotNull(gps);
	}
}
