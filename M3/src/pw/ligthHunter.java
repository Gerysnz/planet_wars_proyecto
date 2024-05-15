package pw;

public class ligthHunter extends ship{
	private static final int  ARMOR_LIGTHHUNTER = 1000;
	private static final int PLUS_ARMOR_LIGTHHUNTER_BY_TECHNOLOGY = 5;
	private static final int  BASE_DAMAGE_LIGTHHUNTER = 50;
	private static final int  PLUS_ATTACK_LIGHTHUNTER_BY_TECHNOLOGY = 10;
	public ligthHunter(int armor, int baseDamage) {
        super(armor, baseDamage);
        
    }

    // Segundo contructor
    public ligthHunter() {
        this(ARMOR_LIGTHHUNTER, BASE_DAMAGE_LIGTHHUNTER);
    }

}
