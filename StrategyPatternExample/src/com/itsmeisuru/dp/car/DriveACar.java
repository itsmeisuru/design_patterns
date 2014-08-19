package com.itsmeisuru.dp.car;

/**
 * @author isuru
 * 
 */
public class DriveACar {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		Car hondaCivic = new HondaCivicHybrid();
		hondaCivic.introduce();
		hondaCivic.drive();

		Car toyotaAllion = new ToyotaAllion();
		toyotaAllion.introduce();
		toyotaAllion.drive();

		Car kiaSorento = new KiaSorento();
		kiaSorento.introduce();
		kiaSorento.drive();
	}

}
