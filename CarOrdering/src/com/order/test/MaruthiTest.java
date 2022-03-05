package com.order.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.order.template.Maruthi;

public class MaruthiTest {

	@Test
	public void selectCarTest() {
		Maruthi b = new Maruthi();

		List<String> mm = new ArrayList<String>();
		mm.add("Alto 800");
		mm.add("Breeze");
		mm.add("Swift Desire");
		mm.add("Baleno");

		String selectedCar = b.selectCar();
		System.out.println(selectedCar);

		assertNotNull(b);
		assertEquals(mm.contains(selectedCar), true);

	}
}
