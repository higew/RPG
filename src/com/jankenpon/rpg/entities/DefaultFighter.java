/**
 * 
 */
package com.jankenpon.rpg.entities;

/**
 * @author NicolasG
 *
 */
public abstract class DefaultFighter implements ClasseRpg {

	@Override
	public String getArmorRestriction() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getWeaponRestriction() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void fight(Personnage defender) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEquipable(Arme arme) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEquipable(Armure armure) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
