package pw;

public class missileLauncher extends defense{
	private  final int  ARMOR_MISSILELAUNCHER = 200;
	private  final int PLUS_ARMOR_MISSILELAUNCHER_BY_TECHNOLOGY = 5;
	private  final int  BASE_DAMAGE_MISSILELAUNCHER = 150;
	private  final int  PLUS_ATTACK_MISSILELAUNCHER_BY_TECHNOLOGY = 5;


	public missileLauncher(int armor, int baseDamage) {
		super(armor, baseDamage);
		
	}
	public missileLauncher() {
        this(200,150);
    }
	


}
