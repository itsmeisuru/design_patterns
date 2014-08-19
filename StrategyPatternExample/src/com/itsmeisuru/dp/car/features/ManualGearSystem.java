package com.itsmeisuru.dp.car.features;

/**
 * @author isuru
 * 
 */
public class ManualGearSystem implements GearSystem {

	@Override
	public void changeGear() {
		System.out.println("Changing gear manually");
	}

}
