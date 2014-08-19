package com.itsmeisuru.dp.car;

import com.itsmeisuru.dp.car.features.PetrolPower;
import com.itsmeisuru.dp.car.features.TripTronicGearSyste;

/**
 * @author isuru
 * 
 */
public class KiaSorento extends Car {

	public KiaSorento() {
		setGearSystem(new TripTronicGearSyste());
		setPowerSource(new PetrolPower());
	}

	@Override
	void introduce() {
		System.out.println("KIA Sorento");
	}

}
