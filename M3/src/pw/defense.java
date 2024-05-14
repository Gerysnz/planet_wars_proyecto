package pw;


public abstract class defense implements militaryUnit, variables{
	private int armor;
	private int initialArmor;
	private int baseDamage;
	

	public defense(int armor, int baseDamage) {
		super();
		this.armor = armor;
		this.baseDamage = baseDamage;
	}

	@Override
	public int attack() {
		// TODO Auto-generated method stub
		return baseDamage;
	}

	@Override
	public void takeDamage(int receivedDamage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getActualArmor() {
		return armor;
	}

	@Override
	public int getMetalCost() {
		if (this instanceof missileLauncher) {
            return variables.METAL_COST_MISSILELAUNCHER;
        } else if (this instanceof ionCannon) {
            return variables.METAL_COST_IONCANNON;
        } else if (this instanceof plasmaCannon) {
            return variables.METAL_COST_PLASMACANNON;
        } else {
        	return 0;
        }
       
	}
	

	@Override
	public int getDeuteriumCost() {
		 if (this instanceof missileLauncher) {
	            return variables.DEUTERIUM_COST_MISSILELAUNCHER;
	        } else if (this instanceof ionCannon) {
	            return variables.DEUTERIUM_COST_IONCANNON;
	        } else if (this instanceof plasmaCannon) {
	            return variables.DEUTERIUM_COST_PLASMACANNON;
	        } else {
	        	return 0;
	        }
	       
		}
	

	@Override
	public int getChanceGeneratingWaste() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getChanceAttackAgain() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void resetArmor() {
		armor = initialArmor;
		
	}

}
