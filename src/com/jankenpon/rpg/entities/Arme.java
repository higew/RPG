/**
 * 
 */
package com.jankenpon.rpg.entities;

/**
 * @author Brice
 *
 */
public abstract class Arme {
	
	public static final int ptsEquipe = 1;
	private int ptsDmg;
	private int coutPtsAction;
	private Arme epee = new ArmePhysique();
	private Arme baton = new ArmeMagique();
	private Arme masse = new ArmeMixte();
	
	
	/**
	 * @return the epee
	 */
	public Arme getEpee() {
		return epee;
	}
	/**
	 * @return the baton
	 */
	public Arme getBaton() {
		return baton;
	}
	/**
	 * @return the masse
	 */
	public Arme getMasse() {
		return masse;
	}
	/**
	 * @return the ptsDmg
	 */
	public int getPtsDmg() {
		return ptsDmg;
	}
	public int getCoutPtsAction() {
		return coutPtsAction;
	}
	
	
}
