package com.jankenpon.rpg.entities;

public class DefaultMagicien extends DefaultFighter implements Magicien {

	@Override
	public String getArmorRestriction() {
		// TODO Auto-generated method stub
		return super.getArmorRestriction();
	}

	@Override
	public String getWeaponRestriction() {
		// TODO Auto-generated method stub
		return super.getWeaponRestriction();
	}

	@Override
	public void fight(Personnage defender) {
		// TODO Auto-generated method stub
		super.fight(defender);
	}

	@Override
	public boolean isEquipable(Arme arme) {
		if (arme instanceof ArmeMagique) { 
			return true;
		}
		return super.isEquipable(arme);
	}

	@Override
	public boolean isEquipable(Armure armure) {
		// TODO Auto-generated method stub
		if (armure instanceof ArmureMagique) { 
			return true;
		}
		return super.isEquipable(armure);
	}
}

