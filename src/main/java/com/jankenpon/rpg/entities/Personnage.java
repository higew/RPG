/**
 * 
 */
package com.jankenpon.rpg.entities;

/**
 * @author Brice
 *
 */
public abstract class Personnage {
	private int hp;
	private int ptsAction;
	private String nom;
	/**
	 * @return the hp
	 */
	public int getHp() {
		return hp;
	}
	/**
	 * @return the ptsAction
	 */
	public int getPtsAction() {
		return ptsAction;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	
	
}
