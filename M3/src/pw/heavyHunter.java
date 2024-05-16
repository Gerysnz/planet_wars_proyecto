package pw;

public class heavyHunter extends ship{
	private final int  ARMOR_HEAVYHUNTER = 1000;
	private final int PLUS_ARMOR_HEAVYHUNTER_BY_TECHNOLOGY = 5;
	private  final int  BASE_DAMAGE_HEAVYHUNTER = 150;
	private  final int  PLUS_ATTACK_HEAVYHUNTER_BY_TECHNOLOGY = 5;


	public heavyHunter(int armor, int baseDamage) {
		super(armor, baseDamage);
		
	}
	 // Segundo contructor
    public heavyHunter() {
        this(1000,150);
    }

}
