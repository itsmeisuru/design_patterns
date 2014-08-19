package com.itsmeisuru.dp.car;

import com.itsmeisuru.dp.car.features.AutomaticGearSystem;
import com.itsmeisuru.dp.car.features.PetrolPower;

/**
 * @author isuru
 * 
 */
public class ToyotaAllion extends Car {

	public ToyotaAllion() {
		setGearSystem(new AutomaticGearSystem());
		setPowerSource(new PetrolPower());
	}

	@Override
	void introduce() {
		System.out.println("Toyota Allion");
	}
}
