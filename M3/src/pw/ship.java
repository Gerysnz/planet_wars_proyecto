package pw;

public class ship implements militaryUnit, variables{
	private int armor;
	private int initialArmor;
	private int baseDamage;
	
	public ship(int armor, int baseDamage) {
		super();
		this.armor = armor;
		this.baseDamage = baseDamage;
	}
	public int getArmor() {
		return armor;
	}
	public void setArmor(int armor) {
		this.armor = armor;
	}
	public int getInitialArmor() {
		return initialArmor;
	}
	public void setInitialArmor(int initialArmor) {
		this.initialArmor = initialArmor;
	}
	public int getBaseDamage() {
		return baseDamage;
	}
	public void setBaseDamage(int baseDamage) {
		this.baseDamage = baseDamage;
	}
	@Override
	public int attack() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void takeDamage(int receivedDamage) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getActualArmor() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getMetalCost() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getDeuteriumCost() {
		// TODO Auto-generated method stub
		return 0;
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
		// TODO Auto-generated method stub
		
	}
	

}
