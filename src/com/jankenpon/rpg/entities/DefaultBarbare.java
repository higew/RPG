package com.jankenpon.rpg.entities;

public class DefaultBarbare extends DefaultFighter implements Barbare {

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
		// TODO Auto-generated method stub
		if (arme instanceof ArmePhysique) { 
			return true;
		}
		return super.isEquipable(arme);
	}

	@Override
	public boolean isEquipable(Armure armure) {
		// TODO Auto-generated method stub
		if (armure instanceof ArmurePhysique) { 
			return true;
		}
		return super.isEquipable(armure);
	}

}
