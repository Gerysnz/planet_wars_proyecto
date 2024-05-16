package pw;

public class ionCannon extends defense{
	private  final int  ARMOR_IONCANNON = 1200;
	private  final int PLUS_ARMOR_IONCANNON_BY_TECHNOLOGY = 5;
	private  final int  BASE_DAMAGE_IONCANNON = 150;
	private  final int  PLUS_ATTACK_IONCANNON_BY_TECHNOLOGY = 5;

	public ionCannon(int armor, int baseDamage) {
		super(armor, baseDamage);
		
	}
	public ionCannon() {
        this(1200,150);
    }

}
