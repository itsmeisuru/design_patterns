package com.itsmeisuru.dp.car;

import com.itsmeisuru.dp.car.features.GearSystem;
import com.itsmeisuru.dp.car.features.PowerSource;

/**
 * @author isuru
 * 
 */
public abstract class Car {

	private GearSystem gearSystem;
	private PowerSource powerSource;

	abstract void introduce();

	public void setGearSystem(final GearSystem gearSystem) {
		this.gearSystem = gearSystem;
	}

	public void setPowerSource(final PowerSource powerSource) {
		this.powerSource = powerSource;
	}

	public void drive() {
		powerSource.powerOn();
		gearSystem.changeGear();
	}

}
