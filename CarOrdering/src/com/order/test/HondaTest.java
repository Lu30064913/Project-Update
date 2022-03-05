package com.order.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.order.template.Honda;

public class HondaTest {

	@Test
	public void selectCarTest() {
		Honda b = new Honda();

		List<String> mm = new ArrayList<String>();
		mm.add("Honda City");
		mm.add("i10");
		mm.add("i20 grand");

		String selectedCar = b.selectCar();
		System.out.println(selectedCar);

		assertNotNull(b);
		assertEquals(mm.contains(selectedCar), true);

	}
}
