package pw;

public class armoredShip extends ship {
	private final int  ARMOR_ARMOREDSHIP = 8000;
	private  final int PLUS_ARMOR_ARMOREDSHIP_BY_TECHNOLOGY = 5;
	private  final int  BASE_DAMAGE_ARMOREDSHIP = 700;
	private  final int  PLUS_ATTACK_ARMOREDSHIP_BY_TECHNOLOGY = 5;


	public armoredShip(int armor, int baseDamage) {
		super(armor, baseDamage);
		
	}
	public armoredShip() {
        this(8000,700);
    }

}
