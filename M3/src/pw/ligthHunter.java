package pw;

public class ligthHunter extends ship{
	private  final int  ARMOR_LIGTHHUNTER = 400;
	private  final int PLUS_ARMOR_LIGTHHUNTER_BY_TECHNOLOGY = 5;
	private  final int  BASE_DAMAGE_LIGTHHUNTER = 80;
	private  final int  PLUS_ATTACK_LIGHTHUNTER_BY_TECHNOLOGY = 5;
	
	public ligthHunter(int armor, int baseDamage) {
        super(armor, baseDamage);
        
        
    }
    // Segundo contructor
    public ligthHunter() {
        this(400,80);
    }

}
