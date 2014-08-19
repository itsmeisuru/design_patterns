package com.itsmeisuru.dp.car.features;

/**
 * @author isuru
 * 
 */
public class Hybrid implements PowerSource {

	@Override
	public void powerOn() {
		System.out.println("Powering on..., Using HYBRID technology");
	}

}
