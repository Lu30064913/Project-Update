package com.order.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.order.factory.BenzModelPlan;
import com.order.factory.BmwModelPlan;
import com.order.factory.CarOrdering;
import com.order.factory.CarOrderingFactory;
import com.order.factory.HondaModelPlan;
import com.order.factory.MaruthiModelPlan;

public class CarOrderingFactoryTest {

	@Test
	public void chooseCompanyMaruthiTest() {
		CarOrderingFactory cof = new CarOrderingFactory();
		CarOrdering co = CarOrderingFactory.chooseCompany("maruthi");
		assertNotNull(co);
		assertTrue(co instanceof MaruthiModelPlan);
	}

	@Test
	public void chooseCompanyBMWTest() {
		CarOrderingFactory cof = new CarOrderingFactory();
		CarOrdering co = CarOrderingFactory.chooseCompany("bmw");
		assertNotNull(co);
		assertTrue(co instanceof BmwModelPlan);
	}

	@Test
	public void chooseCompanyHondaTest() {
		CarOrderingFactory cof = new CarOrderingFactory();
		CarOrdering co = CarOrderingFactory.chooseCompany("honda");
		assertNotNull(co);
		assertTrue(co instanceof HondaModelPlan);
	}

	@Test
	public void chooseCompanyBenzTest() {
		CarOrderingFactory cof = new CarOrderingFactory();
		CarOrdering co = CarOrderingFactory.chooseCompany("benz");
		assertNotNull(co);
		assertTrue(co instanceof BenzModelPlan);
	}
}
