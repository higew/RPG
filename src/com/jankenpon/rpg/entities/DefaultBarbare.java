package com.jankenpon.rpg.entities;

public class DefaultBarbare extends DefaultFighter implements Barbare {

	/* (non-Javadoc)
	 * @see com.jankenpon.rpg.entities.DefaultFighter#getArmorRestriction()
	 */
	@Override
	public String getArmorRestriction() {
		// TODO Auto-generated method stub
		return super.getArmorRestriction();
	}

	/* (non-Javadoc)
	 * @see com.jankenpon.rpg.entities.DefaultFighter#getWeaponRestriction()
	 */
	@Override
	public String getWeaponRestriction() {
		// TODO Auto-generated method stub
		return super.getWeaponRestriction();
	}

	/* (non-Javadoc)
	 * @see com.jankenpon.rpg.entities.DefaultFighter#fight(com.jankenpon.rpg.entities.Personnage)
	 */
	@Override
	public void fight(Personnage defender) {
		// TODO Auto-generated method stub
		super.fight(defender);
	}

	/* (non-Javadoc)
	 * @see com.jankenpon.rpg.entities.DefaultFighter#isEquipable(com.jankenpon.rpg.entities.Arme)
	 */
	@Override
	public boolean isEquipable(Arme arme) {
		// TODO Auto-generated method stub
		return super.isEquipable(arme);
	}

	/* (non-Javadoc)
	 * @see com.jankenpon.rpg.entities.DefaultFighter#isEquipable(com.jankenpon.rpg.entities.Armure)
	 */
	@Override
	public boolean isEquipable(Armure armure) {
		// TODO Auto-generated method stub
		return super.isEquipable(armure);
	}
	
}
