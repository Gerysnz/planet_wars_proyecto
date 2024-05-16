package pw;

public class plasmaCannon extends defense{
	private  final int  ARMOR_PLASMACANNON = 6000;
	private  final int PLUS_ARMOR_PLASMACANNON_BY_TECHNOLOGY = 5;
	private  final int  BASE_DAMAGE_PLASMACANNON = 150;
	private  final int  PLUS_ATTACK_PLASMACANNON_BY_TECHNOLOGY = 5;


	public plasmaCannon(int armor, int baseDamage) {
		super(armor, baseDamage);
		
	}
	public plasmaCannon() {
        this(6000,150);
    }

}
