package com.order.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.order.template.Benz;

public class BenzTest {

	@Test
	public void selectCarTest() {
		Benz b = new Benz();

		List<String> mm = new ArrayList<String>();
		mm.add("Benz A class");
		mm.add("Benz C class");
		mm.add("Benz E class");
		mm.add("Benz G class");

		String selectedCar = b.selectCar();
		System.out.println(selectedCar);

		assertNotNull(b);
		assertEquals(mm.contains(selectedCar), true);

	}
}
