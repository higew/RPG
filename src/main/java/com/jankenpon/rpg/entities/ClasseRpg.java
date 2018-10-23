/**
 * 
 */
package com.jankenpon.rpg.entities;

/**
 * @author NicolasG
 *
 */
public abstract interface ClasseRpg {
	String getArmorRestriction();
	String getWeaponRestriction();
	void fight(Personnage defender);
	boolean isEquipable(Arme arme);
	boolean isEquipable(Armure armure);
	
	
}
