package com.itsmeisuru.dp.car;

import com.itsmeisuru.dp.car.features.AutomaticGearSystem;
import com.itsmeisuru.dp.car.features.Hybrid;

/**
 * @author isuru
 * 
 */
public class HondaCivicHybrid extends Car {

	public HondaCivicHybrid() {
		setPowerSource(new Hybrid());
		setGearSystem(new AutomaticGearSystem());
	}

	@Override
	void introduce() {
		System.out.println("Honda Civic Hybrid");
	}

}
