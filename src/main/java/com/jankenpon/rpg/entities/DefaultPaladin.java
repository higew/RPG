/**
 * 
 */
package com.jankenpon.rpg.entities;

/**
 * @author NicolasG
 *
 */
public class DefaultPaladin extends DefaultFighter implements Paladin {
	public String getArmorRestriction() {
		System.out.println("Il ne peut pas porter ce type d'armure");
		return null;
	}
	public String getWeaponRestriction() {
		System.out.println("Il ne peut pas porter ce type d'arme");
		return null;
	}
	public void fight(Personnage defender) {
		System.out.println("Je me tape!");
	}
	public boolean isEquipable(Arme arme) {
		
		return false;
	}
	public boolean isEquipable(Armure armure) {
		return false;
	}
}
