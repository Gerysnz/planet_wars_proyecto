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
	
	public void upgradeTechnologyDefense() {

    }

    public void upgradeTechnologyAttack() {

    }

    public void newLigthHunter(int n) {

    }

    public void newHeavyHunter(int n) {

    }

    public void newBattleShip(int n) {

    }

    public void newArmoredShip(int n) {

    }

    public void newMissileLauncher(int n) {

    }

    public void newIonCannon(int n) {

    }

    public void newPlasmaCannon(int n) {

    }

    public void printStats() {

    }

}
