package tarea1;

public abstract class AbstractCard implements Card{
	private String Name;
	private int HitPoints, DamageTaken, AttackPoints;
	
	public AbstractCard(String n, int hp, int dt, int ap) {
		this.Name = n;
		this.HitPoints = hp;
		this.DamageTaken = dt;
		this.AttackPoints = ap;
	}
	
	public String getName() {
		return this.Name;
	}
	
	public int getHitPoints() {
		return this.HitPoints;
	}
	
	public int getDamageTaken() {
		return this.DamageTaken;
	}
	
	public int getAttackPoints() {
		return this.AttackPoints;
	}
	
	public void doDamage(int damage) {
		this.DamageTaken = Math.min(this.DamageTaken+damage, this.HitPoints);
	}
	public void boostAttack(int attackPoints) {
		this.AttackPoints = Math.max(0, this.AttackPoints+attackPoints);
	}
	public boolean isAlive() {
		return (this.HitPoints > this.DamageTaken);
	}
	
	public void attackedByAssassin(Assassin anAssassin) {
		this.doDamage(anAssassin.getAttackPoints());
	}
	
	public void attackedByHunter(Hunter aHunter) {
		this.doDamage(aHunter.getAttackPoints());
	}
	
	public void attackedByMage(Mage aMage) {
		this.doDamage(aMage.getAttackPoints());
	}
	
	public void attackedByKnight(Knight aKnight) {
		this.doDamage(aKnight.getAttackPoints());
	}
	
	public void attackedByWarlock(Warlock aWarlock) {
		this.doDamage(aWarlock.getAttackPoints());
	}
	
	public void attackedByHealer(Healer aHealer) {
		this.doDamage(-aHealer.getAttackPoints());
	}
	
	public void attackedByDruid(Druid aDruid) {
		this.doDamage(aDruid.getAttackPoints()/2);
		this.boostAttack(aDruid.getAttackPoints());
	}
	
	public void attackedByShaman(Shaman aShaman) {
		this.doDamage(aShaman.getAttackPoints()/3);
		this.boostAttack(-aShaman.getAttackPoints()/3);
	}
	
	public void attackedByPaladin(Paladin aPaladin) {
		this.doDamage(-aPaladin.getAttackPoints()/3);
		this.boostAttack(aPaladin.getAttackPoints()/3);
	}
}

