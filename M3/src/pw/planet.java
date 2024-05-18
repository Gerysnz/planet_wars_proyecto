package pw;

import java.util.ArrayList;

public class planet implements variables{
	int technologyDefense;
	int technologyAtack;
	int metal;
	int deuterium;
	int upgradeDefenseTechnologyDeuteriumCost;
	int upgradeAttackTechnologyDeuteriumCost;
	ArrayList<militaryUnit>[] army = new ArrayList[7];
	
	public planet(int technologyDefense, int technologyAtack, int metal, int deuterium,
			int upgradeDefenseTechnologyDeuteriumCost, int upgradeAttackTechnologyDeuteriumCost,
			ArrayList<militaryUnit>[] army) {
		super();
		this.technologyDefense = technologyDefense;
		this.technologyAtack = technologyAtack;
		this.metal = metal;
		this.deuterium = deuterium;
		this.upgradeDefenseTechnologyDeuteriumCost = upgradeDefenseTechnologyDeuteriumCost;
		this.upgradeAttackTechnologyDeuteriumCost = upgradeAttackTechnologyDeuteriumCost;
		this.army = army;
	}
		
		public planet() {
		for (int i = 0; i < 7; i++) {
            this.army[i] = new ArrayList<militaryUnit>();
        }
	}

	public int getTechnologyDefense() {
		return technologyDefense;
	}

	public void setTechnologyDefense(int technologyDefense) {
		this.technologyDefense = technologyDefense;
	}

	public int getTechnologyAtack() {
		return technologyAtack;
	}

	public void setTechnologyAtack(int technologyAtack) {
		this.technologyAtack = technologyAtack;
	}

	public int getMetal() {
		return metal;
	}

	public void setMetal(int metal) {
		this.metal = metal;
	}

	public int getDeuterium() {
		return deuterium;
	}

	public void setDeuterium(int deuterium) {
		this.deuterium = deuterium;
	}

	public int getUpgradeDefenseTechnologyDeuteriumCost() {
		return upgradeDefenseTechnologyDeuteriumCost;
	}

	public void setUpgradeDefenseTechnologyDeuteriumCost(int upgradeDefenseTechnologyDeuteriumCost) {
		this.upgradeDefenseTechnologyDeuteriumCost = upgradeDefenseTechnologyDeuteriumCost;
	}

	public int getUpgradeAttackTechnologyDeuteriumCost() {
		return upgradeAttackTechnologyDeuteriumCost;
	}

	public void setUpgradeAttackTechnologyDeuteriumCost(int upgradeAttackTechnologyDeuteriumCost) {
		this.upgradeAttackTechnologyDeuteriumCost = upgradeAttackTechnologyDeuteriumCost;
	}

	public ArrayList<militaryUnit>[] getArmy() {
		return army;
	}

	public void setArmy(ArrayList<militaryUnit>[] army) {
		this.army = army;
	}
	
/**********************************************************************************************************/
	
	public void upgradeTechnologyDefense() throws resourceException {
		int currentCost = upgradeDefenseTechnologyDeuteriumCost;
		if (deuterium >= currentCost) {
			technologyDefense++;
			deuterium -= currentCost;
			upgradeDefenseTechnologyDeuteriumCost *= 1.5; 
	    } else {
	        throw new resourceException("No hay suficiente deuterio para actualizar la tecnología de defensa");
	    }
	}
		
    

    public void upgradeTechnologyAttack() throws resourceException {
        int currentCost = upgradeAttackTechnologyDeuteriumCost;
        if (deuterium >= currentCost) {
            technologyAtack++;
            deuterium -= currentCost;
            // Aumentar el costo para la próxima actualización
            upgradeAttackTechnologyDeuteriumCost *= 1.5; // Incremento del 10%
        } else {
            throw new resourceException("No hay suficiente deuterio para actualizar la tecnología de ataque");
        }
    }

    public void newLigthHunter(int n) throws resourceException{
        int unidad = n;
        for (int i = 0; i < n; i++) {
            if (deuterium >= DEUTERIUM_COST_LIGTHHUNTER & metal >= METAL_COST_LIGTHHUNTER) {
                int armor = ARMOR_LIGTHHUNTER + ((technologyDefense * PLUS_ARMOR_LIGTHHUNTER_BY_TECHNOLOGY) * 1000 / 100);
                int baseDamage = BASE_DAMAGE_LIGTHHUNTER + ((technologyAtack * PLUS_ATTACK_LIGTHHUNTER_BY_TECHNOLOGY) * BASE_DAMAGE_LIGTHHUNTER / 100);
                deuterium -= DEUTERIUM_COST_LIGTHHUNTER;
                metal -= METAL_COST_LIGTHHUNTER;
                army[0].add(new ligthHunter());
            } else {
                throw new resourceException("Deuterium insuficiente para construir unidades.");
            }
        }
    }
    public void newHeavyHunter(int n) throws resourceException {
    	int unidad = n;
        for (int i = 0; i < n; i++) {
            if (deuterium >= DEUTERIUM_COST_HEAVYHUNTER & metal >= METAL_COST_HEAVYHUNTER) {
                int armor = ARMOR_HEAVYHUNTER + ((technologyDefense * PLUS_ARMOR_HEAVYHUNTER_BY_TECHNOLOGY) * 1000 / 100);
                int baseDamage = BASE_DAMAGE_HEAVYHUNTER + ((technologyAtack * PLUS_ATTACK_HEAVYHUNTER_BY_TECHNOLOGY) * BASE_DAMAGE_HEAVYHUNTER / 100);
                deuterium -= DEUTERIUM_COST_HEAVYHUNTER;
                metal -= METAL_COST_HEAVYHUNTER;
                army[1].add(new heavyHunter());
            } else {
                throw new resourceException("Deuterium insuficiente para construir unidades.");
            }
            }

    }

    public void newBattleShip(int n) throws resourceException {
    	int unidad = n;
        for (int i = 0; i < n; i++) {
            if (deuterium >= DEUTERIUM_COST_BATTLESHIP & metal >= METAL_COST_BATTLESHIP) {
                int armor = ARMOR_BATTLESHIP + ((technologyDefense * PLUS_ARMOR_BATTLESHIP_BY_TECHNOLOGY) * 1000 / 100);
                int baseDamage = BASE_DAMAGE_BATTLESHIP + ((technologyAtack * PLUS_ATTACK_BATTLESHIP_BY_TECHNOLOGY) * BASE_DAMAGE_BATTLESHIP / 100);
                deuterium -= DEUTERIUM_COST_BATTLESHIP;
                metal -= METAL_COST_BATTLESHIP;
                army[2].add(new battleShip());
            } else {
                throw new resourceException("Deuterium insuficiente para construir unidades.");
            }
            }
            }

    public void newArmoredShip(int n) throws resourceException {
    	int unidad = n;
        for (int i = 0; i < n; i++) {
            if (deuterium >= DEUTERIUM_COST_ARMOREDSHIP & metal >= METAL_COST_ARMOREDSHIP) {
                int armor = ARMOR_ARMOREDSHIP + ((technologyDefense * PLUS_ARMOR_ARMOREDSHIP_BY_TECHNOLOGY) * 1000 / 100);
                int baseDamage = BASE_DAMAGE_ARMOREDSHIP + ((technologyAtack * PLUS_ATTACK_ARMOREDSHIP_BY_TECHNOLOGY) * BASE_DAMAGE_ARMOREDSHIP / 100);
                deuterium -= DEUTERIUM_COST_ARMOREDSHIP;
                metal -= METAL_COST_ARMOREDSHIP;
                army[3].add(new heavyHunter());
            } else {
                throw new resourceException("Deuterium insuficiente para construir unidades.");
            }
            }
            }

    public void newMissileLauncher(int n) throws resourceException{
    	int unidad = n;
        if (deuterium >= DEUTERIUM_COST_MISSILELAUNCHER & metal >= METAL_COST_MISSILELAUNCHER) {
            for (int i = 0; i < unidad; i++) {
                int armor = ARMOR_MISSILELAUNCHER + ((technologyDefense * PLUS_ARMOR_MISSILELAUNCHER_BY_TECHNOLOGY) * 1000 / 100);
                int baseDamage = BASE_DAMAGE_MISSILELAUNCHER + ((technologyAtack * PLUS_ATTACK_MISSILELAUNCHER_BY_TECHNOLOGY) * BASE_DAMAGE_MISSILELAUNCHER / 100);
                deuterium -= DEUTERIUM_COST_MISSILELAUNCHER;
                metal -= METAL_COST_MISSILELAUNCHER;
                army[4].add(new missileLauncher());
            }
        } else {
            throw new resourceException("Deuterium insuficiente para construir unidades.");
        }

    }

    public void newIonCannon(int n) throws resourceException{
    	int unidad = n;
        if (deuterium >= DEUTERIUM_COST_IONCANNON & metal >= METAL_COST_IONCANNON) {
            for (int i = 0; i < unidad; i++) {
                int armor = ARMOR_IONCANNON + ((technologyDefense * PLUS_ARMOR_IONCANNON_BY_TECHNOLOGY) * 1000 / 100);
                int baseDamage = BASE_DAMAGE_IONCANNON + ((technologyAtack * PLUS_ATTACK_IONCANNON_BY_TECHNOLOGY) * BASE_DAMAGE_IONCANNON / 100);
                deuterium -= DEUTERIUM_COST_IONCANNON;
                metal -= METAL_COST_IONCANNON;
                army[5].add(new ionCannon());
            }
        } else {
            throw new resourceException("Deuterium insuficiente para construir unidades.");
        }

    }

    

    public void newPlasmaCannon(int n) throws resourceException{
    	int unidad = n;
        if (deuterium >= DEUTERIUM_COST_PLASMACANNON & metal >= METAL_COST_PLASMACANNON) {
            for (int i = 0; i < unidad; i++) {
                int armor = ARMOR_PLASMACANNON + ((technologyDefense * PLUS_ARMOR_PLASMACANNON_BY_TECHNOLOGY) * 1000 / 100);
                int baseDamage = BASE_DAMAGE_PLASMACANNON + ((technologyAtack * PLUS_ATTACK_PLASMACANNON_BY_TECHNOLOGY) * BASE_DAMAGE_PLASMACANNON / 100);
                deuterium -= DEUTERIUM_COST_PLASMACANNON;
                metal -= METAL_COST_PLASMACANNON;
                army[6].add(new plasmaCannon());

            }
        } else {
            throw new resourceException("Deuterium insuficiente para construir unidades.");
            }
    	

    }

    public void printStats() {

    }

}
