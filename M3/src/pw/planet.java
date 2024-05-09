package pw;

import java.util.ArrayList;

public class planet {
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
		/*for (int i = 0; i < 7; i++) {
            this.army[i] = new ArrayList<militaryUnit>();
        }*/
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

    public void newLigthHunter(int n) throws resourceException {

    }

    public void newHeavyHunter(int n) throws resourceException {

    }

    public void newBattleShip(int n) throws resourceException{

    }

    public void newArmoredShip(int n) throws resourceException{

    }

    public void newMissileLauncher(int n) throws resourceException{

    }

    public void newIonCannon(int n) {

    }

    public void newPlasmaCannon(int n) {

    }

    public void printStats() {

    }

}
