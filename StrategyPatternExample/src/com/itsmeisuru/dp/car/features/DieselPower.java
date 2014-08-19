package com.itsmeisuru.dp.car.features;

/**
 * @author isuru
 * 
 */
public class DieselPower implements PowerSource {

	@Override
	public void powerOn() {
		System.out.println("Powering on..., Using DIESEL as the power source");
	}

}
