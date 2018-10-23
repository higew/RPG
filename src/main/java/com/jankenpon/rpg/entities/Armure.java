/**
 * 
 */
package com.jankenpon.rpg.entities;

/**
 * @author Brice
 *
 */
public abstract class Armure {
	private int ptsArmure;
	private Armure plaque = new ArmurePhysique();
	private Armure tissu = new ArmureMagique();
	private Armure acier = new ArmureMixte();
	

	/**
	 * @return the plaque
	 */
	public Armure getPlaque() {
		return plaque;
	}


	/**
	 * @return the tissu
	 */
	public Armure getTissu() {
		return tissu;
	}


	/**
	 * @return the acier
	 */
	public Armure getAcier() {
		return acier;
	}


	/**
	 * @return the ptsArmure
	 */
	public int getPtsArmure() {
		return ptsArmure;
	}
	
}
