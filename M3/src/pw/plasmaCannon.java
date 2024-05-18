package pw;

public class plasmaCannon extends defense{
	private  final int  ARMOR_PLASMACANNON = 7000;
	private  final int PLUS_ARMOR_PLASMACANNON_BY_TECHNOLOGY = 5;
	private  final int  BASE_DAMAGE_PLASMACANNON = 2000;
	private  final int  PLUS_ATTACK_PLASMACANNON_BY_TECHNOLOGY = 5;


	public plasmaCannon(int armor, int baseDamage) {
		super(armor, baseDamage);
		
	}
	public plasmaCannon() {
        this(7000,2000);
    }

}
