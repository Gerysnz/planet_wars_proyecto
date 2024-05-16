package pw;

public class battleShip extends ship{
	private  final int  ARMOR_BATTLESHIP = 6000;
	private  final int PLUS_ARMOR_BATTLESHIP_BY_TECHNOLOGY = 5;
	private final int BASE_DAMAGE_BATTLESHIP = 1000;
	public final int PLUS_ATTACK_BATTLESHIP_BY_TECHNOLOGY = 5;


	public battleShip(int armor, int baseDamage) {
		super(armor, baseDamage);
		
	}
	public battleShip() {
        this(6000,1000);
    }

}
