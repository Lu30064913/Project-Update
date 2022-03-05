package com.order.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.order.template.Benz;
import com.order.template.Bmw;

public class BmwTest {

	@Test
	public void selectCarTest() {
		Bmw b = new Bmw();

		List<String> mm = new ArrayList<String>();
		mm.add("BMW x3");
		mm.add("BMW x5");
		mm.add("BMW x7");

		String selectedCar = b.selectCar();
		System.out.println(selectedCar);

		assertNotNull(b);
		assertEquals(mm.contains(selectedCar), true);

	}
}
